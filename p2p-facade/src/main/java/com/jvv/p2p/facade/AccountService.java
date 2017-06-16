package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

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

/**
 * Created by Administrator on 2015/5/20.
 */
@WebService
public interface AccountService {

	/**
	 * 开通支付账户
	 *
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result open(String loginUid) throws IOException;

	/**
	 * 是否可以开通
	 * 
	 * @param phone
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result isOpen(String phone) throws IOException;

	/**
	 * 是否 可以实名认证
	 *
	 * @param canRealName
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result realNameCanApply(String loginUid) throws IOException;

	/**
	 * 实名认证
	 *
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result realnameApply(RealNameRequest request) throws IOException;

	/**
	 * 获得账户信息
	 *
	 * @param loginUid
	 * @return
	 */
	@WebMethod
	UserAccountInfoT getInfo(String loginUid) throws IOException;

	/**
	 * 获取 账户统计信息
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	@WebMethod
	AccountTotal getCount(String loginUid) throws IOException;

	/**
	 * 
	 * 获得用户的 余额
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	@WebMethod
	Accountbalanceinfot getBalance(String loginUid) throws IOException;

	/**
	 * 绑定银行卡 step1
	 *
	 * @param step1
	 * @return
	 */
	@WebMethod
	Result bindBankStep1(BindBankStep1Request step1) throws IOException;

	/**
	 * 绑定银行卡 step2
	 *
	 * @param step2
	 * @return
	 */
	@WebMethod
	Result bindBankStep2(BindBankStep2Request step2) throws IOException;

	/**
	 * 绑定支付手机号
	 * 
	 * @throws IOException
	 */
	@WebMethod
	Result bindMobile(BindMobileRequest request) throws IOException;

	/**
	 * 解除银行卡 绑定
	 * 
	 * @param loginUid
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result unbindbank(String loginUid) throws IOException;

	@WebMethod
	Checkrealnameinfot getRealName(String loginUid) throws IOException;

	/**
	 * 能否绑定银行卡
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	@WebMethod
	Result canbindBank(String loginUid) throws IOException;

	/**
	 * 获取 绑定银行卡信息
	 * 
	 * @param loginUid
	 * @throws IOException
	 */
	@WebMethod
	Userbankinfot getBindBankInfo(String loginUid) throws IOException;
	
	
	/**
	 * 检查用户是否开通并实名认证
	 * @param phone
	 * @return
	 * @throws IOException
	 */
	Result checkUserIsOpenAndRealName(String phone) throws IOException;
}
