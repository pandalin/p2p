package com.jvv.p2p.biz.pay;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.google.common.eventbus.EventBus;
import com.jvv.p2p.biz.EventType;
import com.jvv.p2p.entity.RechargeFlowDto;
import com.jvv.p2p.entity.WithDrawFlowDto;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.PayService;
import com.jvv.p2p.facade.request.ChargeQryRequest;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.facade.request.RechargeStep1Request;
import com.jvv.p2p.facade.request.RechargeStep2Request;
import com.jvv.p2p.facade.request.WithdrawRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.pay.Rechargequick;
import com.jvv.p2p.facade.response.pay.Sinacharge;
import com.jvv.p2p.facade.response.pay.WithdrawTradeno;
import com.jvv.p2p.integrate.longkin.LkAccountService;
import com.jvv.p2p.integrate.longkin.LkPayService;
import com.jvv.p2p.util.RedisKey;

/**
 * 支付服务类
 * 
 * @author cx
 *
 */
@Named("payService")
public class PayServiceImpl implements PayService {

	@Inject
	private LkPayService lkPayService;
	@Inject
	private InvestService investService;
	@Inject
	private InvestTaskService investTaskService;
	@Inject
	private RechargeService rechargeService;
	@Inject
	private WithdrawService withdrawService;
	@Inject
	private LkAccountService lkAccountService;
	@Inject
	private LoginUidService loginUidService;

	private Log log = LogFactory.getLog(this.getClass());

	@Inject
	private RedisTemplate<String, Map<String, RechargeStep1Request>> redisTemplate;

	@PostConstruct
	public void init() {
		Map<String, RechargeStep1Request> rechargeMap = new HashMap<String, RechargeStep1Request>();
		redisTemplate.opsForValue().set(RedisKey.RECHARGE_STEP1, rechargeMap);
	}

	@Override
	public Result invest(InvestRequest invest) throws IOException {
		Result result = lkPayService.invest(invest);

		// 记录
		if (result != null && result.isSuc()) {

			EventBus event = new EventBus(EventType.invest.name());
			event.register(investService);
			event.post(invest);

			log.info("开始调用 任务方法 参数 invest" + ToStringBuilder.reflectionToString(invest));
			//fix not call
			investTaskService.onInvest(invest);

			log.info("调用完成");

		}

		return result;

	}

	@Override
	public Rechargequick rechargeStep1(RechargeStep1Request step1) throws IOException {

		Result r = lkAccountService.upgrade(step1.getLoginUid());
		if (r.isSuc()) {
			step1.setLoginUid(r.getLoginUid());

		}

		Rechargequick rechargequick = lkPayService.rechargeStep1(step1);
		if (rechargequick.getResult().isSuc()) {
			//如果第一步成功 记录关系
			Map<String, RechargeStep1Request> rechargeMap = redisTemplate.opsForValue().get(RedisKey.RECHARGE_STEP1);
			rechargeMap.put(rechargequick.getTradeno(), step1);

			redisTemplate.opsForValue().set(RedisKey.RECHARGE_STEP1, rechargeMap);

		}
		return rechargequick;
	}

	@Override
	public Result rechargeStep2(RechargeStep2Request step2) throws IOException {
		Result result = lkPayService.rechargeStep2(step2);

		if (result != null && result.isSuc()) {//充值成功
			//记录充值流水
			EventBus event = new EventBus(EventType.recharge.name());
			event.register(rechargeService);
			Map<String, RechargeStep1Request> rechargeMap = redisTemplate.opsForValue().get(RedisKey.RECHARGE_STEP1);
			RechargeStep1Request step1 = rechargeMap.get(step2.getTradeno());

			RechargeFlowDto dto = new RechargeFlowDto();
			dto.setAmonut(step1.getAmount());
			dto.setExtFlowno(step2.getTradeno());
			dto.setExtUserId(loginUidService.getIdByLoginUid(result.getLoginUid()));

			event.post(dto);

		}
		return result;
	}

	@Override
	public WithdrawTradeno withdraw(WithdrawRequest request) throws IOException {
		WithdrawTradeno wt = lkPayService.withdraw(request);

		Result result = wt.getResult();

		if (result != null && result.isSuc()) {//提现成功
			//记录提现流水
			EventBus event = new EventBus(EventType.withdraw.name());
			event.register(withdrawService);

			WithDrawFlowDto dto = new WithDrawFlowDto();
			dto.setAmount(request.getAmount());
			dto.setExtFlowno(wt.getTradeno());
			dto.setExtUserId(loginUidService.getIdByLoginUid(result.getLoginUid()));

			event.post(dto);

		}

		return wt;
	}

	@Override
	public Sinacharge queryCharge(ChargeQryRequest qry) throws IOException {

		return lkPayService.queryCharge(qry);
	}

}
