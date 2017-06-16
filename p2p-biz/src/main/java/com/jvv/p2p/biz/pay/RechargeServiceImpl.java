package com.jvv.p2p.biz.pay;

import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.util.Assert;

import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.dao.RechargeFlowDtoMapper;
import com.jvv.p2p.entity.RechargeFlowDto;

@Named
public class RechargeServiceImpl implements RechargeService {

	@Inject
	private RechargeFlowDtoMapper rechargeFlowDtoMapper;

	@Override
	public void insert(RechargeFlowDto flow) {
		//  设置初始值
		Assert.notNull(flow);

		flow.setCreatetime(new Date());
		flow.setId(UUID.randomUUID().toString());

		rechargeFlowDtoMapper.insertSelective(flow);

	}

	@Subscribe
	@Override
	public void onRecharge(RechargeFlowDto flow) {
		
		insert(flow);
	}

}
