package com.jvv.p2p.biz.pay;

import com.jvv.p2p.entity.RechargeFlowDto;
import com.jvv.p2p.facade.request.InvestRequest;

/**
 * 充值流水保存
 * 
 * @author cx
 *
 */
public interface RechargeService {

	/**
	 * 保存充值流水
	 * 
	 * @param flow
	 */
	void insert(RechargeFlowDto flow);

	/**
	 * 当投资成功的事件 发生的时候。
	 * 
	 * 
	 * @param invest
	 */
	void onRecharge(RechargeFlowDto flow);
}
