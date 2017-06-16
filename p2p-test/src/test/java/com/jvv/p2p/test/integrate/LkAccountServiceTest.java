package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.request.BindBankStep1Request;
import com.jvv.p2p.facade.request.BindBankStep2Request;
import com.jvv.p2p.facade.request.BindMobileRequest;
import com.jvv.p2p.facade.request.RealNameRequest;
import com.jvv.p2p.facade.response.account.AccountTotal;
import com.jvv.p2p.facade.response.account.Accountbalanceinfot;
import com.jvv.p2p.facade.response.account.Checkrealnameinfot;
import com.jvv.p2p.facade.response.user.UserAccountInfoT;
import com.jvv.p2p.integrate.longkin.LkAccountService;

public class LkAccountServiceTest extends P2pBaseTest {

	@Inject
	private LkAccountService service;

	@Test
	public void getInfo() throws IOException {
		UserAccountInfoT userAccountInfoT = service.getInfo(loginUid);
		logger.info(ToStringBuilder.reflectionToString(userAccountInfoT));
	}

	
	public void ac() throws IOException {
		service.upgrade(loginUid);
	}

	
	public void abc() throws IOException {
		service.unbindbank(loginUid);
	}


	@Test
	public void b() {

		try {

			AccountTotal totle = service.getCount(loginUid);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ab() throws IOException {
		service.realNameCanApply(loginUid);

	}

	public void j() {

		try {

			Checkrealnameinfot realname = service.getRealName(loginUid);
			log.debug(ToStringBuilder.reflectionToString(realname));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i() throws IOException {
		BindBankStep1Request step1 = new BindBankStep1Request();
		step1.setLoginUid(loginUid);
		step1.setSessionid("123");

		step1.setBankCode("CCB");
		step1.setBankName("建设银行");
		step1.setBankPhone("13618311009");

		step1.setRegionCode("4300000000");
		step1.setRegion1Name("重庆市");
		step1.setRegion2Name("江北区");

		step1.setBankCardNo("55555555");
		step1.setBankCardNoOk(step1.getBankCardNo());

		service.bindBankStep1(step1);

	}

	public void i2() throws IOException {
		BindBankStep2Request step2 = new BindBankStep2Request();
		step2.setLoginUid(loginUid);
		step2.setSessionId("123");
		step2.setValidCode("752778");
		service.bindBankStep2(step2);
	}

	public void g() {

		try {
			service.getBindBankInfo(loginUid);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void e() {
		RealNameRequest request = new RealNameRequest();
		request.setLoginUid(loginUid);
		request.setRealname("陈旭");
		request.setCertNo("510902198307179171");

		try {
			service.realnameApply(request);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void a() {
		try {
			UserAccountInfoT account = service.getInfo(loginUid);
			log.debug(ToStringBuilder.reflectionToString(account));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void c() {

		try {
			Accountbalanceinfot bal = service.getBalance(loginUid);
			log.debug(ToStringBuilder.reflectionToString(bal));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void smsTest() {
		//TODO 

		try {
			smsService.sendBindPhoneSms(loginUid, user.getPhone());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void d() {
		BindMobileRequest request = new BindMobileRequest();
		request.setLoginUid(loginUid);
		request.setPhone(user.getPhone());
		request.setCode("90067");

		try {
			service.bindMobile(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void h() {

		try {
			service.canBindBank(loginUid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
