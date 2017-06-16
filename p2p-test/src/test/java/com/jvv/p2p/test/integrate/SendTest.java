package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.em.SmsChanel;
import com.jvv.p2p.facade.em.SmsType;
import com.jvv.p2p.facade.request.LoginRequest;
import com.jvv.p2p.facade.request.RealNameCanApplyRequest;
import com.jvv.p2p.facade.request.RegRequest;
import com.jvv.p2p.facade.request.SmsRequest;
import com.jvv.p2p.facade.response.user.Userallinfot;
import com.jvv.p2p.integrate.longkin.LKSmsService;
import com.jvv.p2p.integrate.longkin.LkAccountService;
import com.jvv.p2p.integrate.longkin.LkPayService;
import com.jvv.p2p.integrate.longkin.LkUserService;
import com.jvv.p2p.test.BaseTest;

/**
 * Created by cx on 2015/5/25.
 */
public class SendTest extends BaseTest {

	@Inject
	LKSmsService lKSmsService;
	@Inject
	LkUserService lkUserService;
	@Inject
	LkPayService lkPayService;
	@Inject
	LkAccountService lkAccountService;
	

	@Test
	public void a(){
		SmsRequest sms=new SmsRequest();
		sms.setPhone("13662245985");
		sms.setChanel(SmsChanel.sms.getValue());
		sms.setType(SmsType.regist.getValue());
		
		try {
			lKSmsService.sendSms(sms);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void b(){
		RegRequest reg=new RegRequest();
		reg.setPhone("18375693021");
		reg.setPassword("lin123");
		reg.setCode("17090");
		
		try {
			lkUserService.regionReg(reg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void loginTest(){
		LoginRequest login=new LoginRequest();
		login.setUsername("18375693021");
		login.setPassword("lin123");
		
		
		try {
			Userallinfot response=lkUserService.loginIn(login);
			
			log.debug(ToStringBuilder.reflectionToString(response));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void d(){
		RealNameCanApplyRequest request=new RealNameCanApplyRequest();
		request.setLoginUid("UfQNsCW+ruSW6gN8K0MrvR0mFQuq0QtZ");
		try {
			lkAccountService.realNameCanApply("UfQNsCW+ruSW6gN8K0MrvR0mFQuq0QtZ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void e(){
		try {
			lkAccountService.open("xw4j6DqJOsbhxYOl4hSx8ivhWujfND3z");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
