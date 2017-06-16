package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.BindBankStep1Request;
import com.jvv.p2p.facade.request.BindBankStep2Request;
import com.jvv.p2p.facade.request.BindMobileRequest;
import com.jvv.p2p.facade.request.RealNameRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.AccountTotal;
import com.jvv.p2p.facade.response.account.Accountbalanceinfot;
import com.jvv.p2p.facade.response.account.Checkrealnameinfot;
import com.jvv.p2p.facade.response.account.Userbankinfot;
import com.jvv.p2p.facade.response.user.UserAccountInfoT;

public interface LkAccountService {

	/**
	 * 开通支付账户
	 *
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	Result open(String loginUid) throws IOException;

	/**
	 * 解除银行卡 绑定
	 * 
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	Result unbindbank(String loginUid) throws IOException;

	/**
	 * 是否 可以实名认证
	 *
	 * @param canRealName
	 * @return
	 * @throws IOException
	 */
	Result realNameCanApply(String loginUid) throws IOException;

	/**
	 * 
	 * 获取用户 实名认证信息
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	Checkrealnameinfot getRealName(String loginUid) throws IOException;

	/**
	 * 升级成为 存钱罐
	 * 
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	Result upgrade(String loginUid) throws IOException;

	/**
	 * 实名认证
	 *
	 * @param request
	 * @return
	 * @throws IOException
	 */
	Result realnameApply(RealNameRequest request) throws IOException;

	/**
	 * 获得账户信息
	 *
	 * @param loginUid
	 * @return
	 */
	UserAccountInfoT getInfo(String loginUid) throws IOException;

	/**
	 * 获取 账户统计信息
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	AccountTotal getCount(String loginUid) throws IOException;

	/**
	 * 
	 * 获得用户的 余额
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	Accountbalanceinfot getBalance(String loginUid) throws IOException;

	/**
	 * 绑定银行卡 step1
	 *
	 * @param step1
	 * @return
	 */
	Result bindBankStep1(BindBankStep1Request step1) throws IOException;

	/**
	 * 绑定银行卡 step2
	 *
	 * @param step2
	 * @return
	 */
	Result bindBankStep2(BindBankStep2Request step2) throws IOException;

	/**
	 * 绑定支付手机号
	 * 
	 * @throws IOException
	 */
	Result bindMobile(BindMobileRequest request) throws IOException;

	/**
	 * 能否绑定 银行卡
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	Result canBindBank(String loginUid) throws IOException;

	/**
	 * 获取 绑定银行卡信息
	 * 
	 * @param loginUid
	 * @throws IOException
	 */

	Userbankinfot getBindBankInfo(String loginUid) throws IOException;

	/**
	 * 是否可以开通
	 * 
	 * @param phone
	 * @return
	 * @throws IOException
	 */

	Result isOpen(String phone) throws IOException;

}
