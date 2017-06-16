package com.jvv.p2p.biz.pay;

import com.jvv.p2p.entity.WithDrawFlowDto;

public interface WithdrawService {

	/**
	 * 保存充值流水
	 * 
	 * @param flow
	 */
	void insert(WithDrawFlowDto flow);

	/**
	 * 当投资成功的事件 发生的时候。
	 * 
	 * 
	 * @param invest
	 */
	void onWithDraw(WithDrawFlowDto flow);
}
