package com.jvv.p2p.biz.pay;

import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.util.Assert;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.dao.TradeFlowDtoMapper;
import com.jvv.p2p.entity.TradeFlowDto;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.request.InvestRequest;

@Named
public class InvestServiceImpl implements InvestService {

	@Inject
	private TradeFlowDtoMapper tradeFlowDtoMapper;
	@Inject
	private LoginUidService loginUidService;

	@Override
	public void insert(TradeFlowDto flow) {
		Assert.notNull(flow);

		flow.setCreatetime(new Date());
		flow.setId(UUID.randomUUID().toString());

		tradeFlowDtoMapper.insertSelective(flow);
	}

	
	@Override
	@Subscribe
	@AllowConcurrentEvents
	public void onInvest(InvestRequest invest) {
		TradeFlowDto flow = new TradeFlowDto();
		flow.setAmount(invest.getOverinvestamount());
		flow.setExtTradeId(invest.getTradeid());

		flow.setExtUserId(loginUidService.getIdByLoginUid(invest.getLoginUid()));

		insert(flow);
	}

}
