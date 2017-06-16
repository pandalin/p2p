package com.jvv.p2p.biz.pay;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.biz.BusinessException;
import com.jvv.p2p.biz.user.UserDtoService;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.portal.facade.JvvTaskFacade;

@Named
public class InvestTaskServiceImpl implements InvestTaskService {

	@Inject
	private LoginUidService loginUidService;
	@Inject
	private UserDtoService userDtoService;
	@Inject
	private JvvTaskFacade jvvTaskFacade;
	
	
	private Log log = LogFactory.getLog(this.getClass());

	@Override
	@Subscribe
	@AllowConcurrentEvents
	public void onInvest(InvestRequest invest) {
		String extUserId = loginUidService.getIdByLoginUid(invest.getLoginUid());
		if (StringUtils.isEmpty(extUserId)) {
			log.error("loginUid:[" + invest.getLoginUid() + "]找不到 用户id");
			return;
		}
		log.info("隆金宝 用户id:" + extUserId);

		ExtUserDto user = userDtoService.getByExtUserId(extUserId);
		
		if (user == null) {
			String mes = "隆金宝 用户id:" + extUserId + " 数据记录缺失";
			log.info(mes);
			throw new BusinessException(mes);
		}

		log.info("p2p调用 任务完成。 userId:" + user.getUserId() + "完成 任务id3");
		jvvTaskFacade.userCompleteOnceTask(user.getUserId(), 3);
	}

}
