package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.request.MyRepayQryRequest;
import com.jvv.p2p.facade.response.order.MyInvest;
import com.jvv.p2p.facade.response.order.MyRepay;

public interface LkOrderService {

	/**
	 * 我的投资查询
	 * 
	 * @param request
	 *            查询对象
	 * @retrun
	 * 
	 */
	MyInvest queryMyInvest(MyInvestQryRequest request) throws IOException;

	
	/**
	 * 查询我的回款计划
	 * 
	 * @param request
	 * @throws IOException
	 */
	MyRepay queryMyRepay(MyRepayQryRequest request) throws IOException;
	
	
	

}
