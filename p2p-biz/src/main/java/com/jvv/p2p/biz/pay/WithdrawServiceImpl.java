package com.jvv.p2p.biz.pay;

import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.util.Assert;

import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.dao.WithDrawFlowDtoMapper;
import com.jvv.p2p.entity.WithDrawFlowDto;

@Named
public class WithdrawServiceImpl implements WithdrawService {

	@Inject
	private WithDrawFlowDtoMapper withDrawFlowDtoMapper;

	@Override
	public void insert(WithDrawFlowDto flow) {
		//  设置初始值
		Assert.notNull(flow);

		flow.setCreatetime(new Date());
		flow.setId(UUID.randomUUID().toString());

		withDrawFlowDtoMapper.insertSelective(flow);
		
	}

	@Override
	@Subscribe
	public void onWithDraw(WithDrawFlowDto flow) {

		this.insert(flow);

	}

}
