package com.jvv.p2p.test.biz;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Assert;
import org.junit.Test;

import com.jvv.p2p.facade.AccountService;
import com.jvv.p2p.facade.PayService;
import com.jvv.p2p.facade.ProductService;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.facade.request.RealNameRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.test.integrate.P2pBaseTest;

public class P2pTest extends P2pBaseTest {

	@Inject
	private PayService payService;

	@Inject
	private ProductService productService;

	@Inject
	private AccountService accountService;

	
	public void b() {

		try {
			smsService.sendInvestSms(loginUid, user2.getPhone());
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void c() {
		RealNameRequest request = new RealNameRequest();
		request.setLoginUid(loginUid);
		request.setCertNo("165");
		request.setRealname("龙儿");
		try {
			accountService.realnameApply(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void a() {

		try {

			//TODO 购买产品

			InvestRequest invert = new InvestRequest();
			invert.setCode("88219");
			invert.setInvestamount(BigDecimal.valueOf(100));
			invert.setOverinvestamount(invert.getInvestamount());

			invert.setLoginUid(loginUid);
			invert.setTradeid("8");
			Result r=payService.invest(invert);
			
			log.debug(ToStringBuilder.reflectionToString(r));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}

	}
}
