package com.jvv.p2p.test.biz;

import java.io.IOException;

import javax.inject.Inject;

import org.junit.Test;

import com.jvv.p2p.facade.SmsService;
import com.jvv.p2p.test.integrate.P2pBaseTest;

public class SmsTest extends P2pBaseTest {

	@Inject
	SmsService smsSerice;

	@Test
	public void a() {

		try {
			smsSerice.sendInvestSms(loginUid, user7.getPhone());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
