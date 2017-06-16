package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jvv.p2p.facade.em.SmsChanel;
import com.jvv.p2p.facade.request.SmsRequest;
import com.jvv.p2p.facade.response.Result;

/**
 * Created by cx on 2015/5/25.
 */
@WebService
public interface SmsService {

	/**
	 * 发送短信
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendSms(SmsRequest request) throws IOException;

	/**
	 * 发送短信
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendVoice(SmsRequest request) throws IOException;

	/**
	 * 发送绑定手机短息
	 * 
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendRegisSms(String phone) throws IOException;

	/**
	 * 发送绑定手机短息
	 * 
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendRegisVoice(String phone, SmsChanel chanel) throws IOException;

	/**
	 * 发送绑定手机短息
	 * 
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendBindPhoneSms(String loginUid, String phone) throws IOException;

	/**
	 * 发送 投资验证短信
	 * 
	 * @param loginUid
	 * @param phone
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendInvestSms(String loginUid, String phone) throws IOException;

	/**
	 * 发送提现短信
	 * 
	 * @param loginUid
	 * @param phone
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Result sendWithdrawSms(String loginUid, String phone) throws IOException;

}
