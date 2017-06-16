package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.request.MyRepayQryRequest;
import com.jvv.p2p.facade.response.order.MyInvest;
import com.jvv.p2p.facade.response.order.MyRepay;

/**
 * 订单查询
 * 
 * <p/>
 * Created by Administrator on 2015/5/20.
 */
@WebService
public interface OrderService {

	/**
	 * 我的投资查询
	 * 
	 * @param request
	 *            查询对象
	 * @retrun
	 * 
	 */
	@WebMethod
	MyInvest queryMyInvest(MyInvestQryRequest request) throws IOException;
	
	/**
	 * 我的正在投资查询
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	MyInvest queryMyInvesting(MyInvestQryRequest request) throws IOException; 

	/**
	 * 查询我的回款计划
	 * 
	 * @param request
	 * @return 
	 * @throws IOException
	 */
	@WebMethod
	MyRepay queryMyRepay(MyRepayQryRequest request) throws IOException;
}
