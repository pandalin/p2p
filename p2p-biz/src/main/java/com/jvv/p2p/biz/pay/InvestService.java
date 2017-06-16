package com.jvv.p2p.biz.pay;

import com.jvv.p2p.entity.TradeFlowDto;
import com.jvv.p2p.facade.request.InvestRequest;

public interface InvestService {

	/**
	 * 投资流水
	 * 
	 * @param flow
	 */
	void insert(TradeFlowDto flow);

	/**
	 * 当投资成功的事件 发生的时候。
	 * 
	 * 
	 * @param invest
	 */
	void onInvest(InvestRequest invest);

}
