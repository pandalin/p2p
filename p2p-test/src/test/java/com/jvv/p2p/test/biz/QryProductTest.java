package com.jvv.p2p.test.biz;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.Test;

import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.integrate.longkin.LkPayService;
import com.jvv.p2p.test.integrate.P2pBaseTest;

public class QryProductTest extends P2pBaseTest {

	@Inject
	private LkPayService lkPayService;

	

	public void b() throws IOException{
		smsService.sendInvestSms(loginUid, user2.getPhone());
	}
	
	@Test
	public void a() throws IOException {
		//TODO 登陆

		//TODO 购买产品
		InvestRequest invest = new InvestRequest();
		invest.setLoginUid(loginUid);
		invest.setInvestamount(BigDecimal.valueOf(500));
		invest.setOverinvestamount(invest.getInvestamount());
		invest.setTradeid("79fece16-2167-4a78-a2fb-afc3bdfefc24");
		
		invest.setCode("53608");

		lkPayService.invest(invest);

	}

}
