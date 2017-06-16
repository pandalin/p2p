package com.jvv.p2p.biz.user;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.util.Assert;

import com.jvv.p2p.facade.SmsService;
import com.jvv.p2p.facade.em.SmsChanel;
import com.jvv.p2p.facade.em.SmsType;
import com.jvv.p2p.facade.request.SmsRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.integrate.longkin.LKSmsService;

/**
 * Created by cx on 2015/5/27.
 */
@Named("smsService")
public class SmsServiceImpl implements SmsService {

	@Inject
	private LKSmsService lkSmsService;

	@Override
	public Result sendSms(SmsRequest request) throws IOException {
		Assert.notNull(request);
		//覆盖 短信通道设置 为短信
		request.setChanel(SmsChanel.sms.getValue());
		return lkSmsService.sendSms(request);

	}

	@Override
	public Result sendBindPhoneSms(String loginUid, String phone) throws IOException {
		SmsRequest request = new SmsRequest(SmsType.bind_phone);
		request.setLoginUid(loginUid);
		request.setPhone(phone);

		return this.sendSms(request);
	}

	@Override
	public Result sendInvestSms(String loginUid, String phone) throws IOException {
		SmsRequest request = new SmsRequest(SmsType.invest);
		request.setLoginUid(loginUid);
		request.setPhone(phone);

		return this.sendSms(request);
	}

	@Override
	public Result sendWithdrawSms(String loginUid, String phone) throws IOException {
		SmsRequest request = new SmsRequest(SmsType.withdraw);
		request.setLoginUid(loginUid);
		request.setPhone(phone);

		return this.sendSms(request);
	}

	@Override
	public Result sendRegisSms(String phone) throws IOException {
		SmsRequest request = new SmsRequest(SmsType.regist);
		request.setPhone(phone);

		return this.sendSms(request);
	}

	@Override
	public Result sendVoice(SmsRequest request) throws IOException {
		Assert.notNull(request);
		//覆盖 短信通道设置 为短信
		request.setChanel(SmsChanel.voice.getValue());
		return lkSmsService.sendSms(request);
	}

	@Override
	public Result sendRegisVoice(String phone, SmsChanel chanel) throws IOException {
		SmsRequest request = new SmsRequest(SmsType.regist);
		request.setPhone(phone);

		return this.sendVoice(request);
	}

}
