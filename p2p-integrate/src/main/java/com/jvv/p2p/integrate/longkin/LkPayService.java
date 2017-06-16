package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.ChargeQryRequest;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.facade.request.RechargeStep1Request;
import com.jvv.p2p.facade.request.RechargeStep2Request;
import com.jvv.p2p.facade.request.WithdrawRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.pay.Rechargequick;
import com.jvv.p2p.facade.response.pay.Sinacharge;
import com.jvv.p2p.facade.response.pay.WithdrawTradeno;

/**
 * Created by cx on 2015/5/25.
 */
public interface LkPayService {

	/**
	 * 用户 投资
	 * 
	 * @param invest
	 *            产品订单号
	 */
	Result invest(InvestRequest invest) throws IOException;

	/**
	 * 用户充值 第一步
	 * 
	 * @param step1
	 * @return
	 * @throws IOException
	 */
	Rechargequick rechargeStep1(RechargeStep1Request step1) throws IOException;

	/**
	 * 用户充值 第二步
	 * 
	 * @param step2
	 *            充值第二步
	 * @throws IOException
	 */
	Result rechargeStep2(RechargeStep2Request step2) throws IOException;

	/**
	 * 提现
	 * 
	 * @param request
	 * @throws IOException
	 */
	WithdrawTradeno withdraw(WithdrawRequest request) throws IOException;

	
	/**
	 * 交易记录查询
	 * 
	 * @throws IOException
	 */
	Sinacharge queryCharge(ChargeQryRequest qry) throws IOException;

}
