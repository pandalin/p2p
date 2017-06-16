package com.jvv.p2p.test.biz;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.jvv.p2p.facade.PayService;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.facade.request.RechargeStep1Request;
import com.jvv.p2p.facade.request.RechargeStep2Request;
import com.jvv.p2p.facade.request.WithdrawRequest;
import com.jvv.p2p.test.integrate.P2pBaseTest;

public class PayServiceTest extends P2pBaseTest {

	@Inject
	PayService payService;

	@Test
	@Rollback(false)
	public void investTest() {
		InvestRequest invest = new InvestRequest();

		invest.setLoginUid(loginUid);
		invest.setCode("51489");
		invest.setInvestamount(BigDecimal.valueOf(100));
		invest.setOverinvestamount(BigDecimal.valueOf(100));
		invest.setTradeid("15");
		try {
			payService.invest(invest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void rechargeTest() throws IOException {
		RechargeStep1Request step1 = new RechargeStep1Request();

		step1.setAmount(BigDecimal.valueOf(200));
		step1.setLoginUid(loginUid);

		payService.rechargeStep1(step1);

	}

	
	public void withdrawTest() throws IOException {
		WithdrawRequest request = new WithdrawRequest();
		request.setAmount(BigDecimal.valueOf(1));
		request.setCode("73666");
		request.setLoginUid(loginUid);
		payService.withdraw(request);
	}

	public void rechargeStep2Test() throws IOException {
		RechargeStep2Request step2 = new RechargeStep2Request();
		step2.setLoginUid(loginUid);
		step2.setTradeno("2015060516015885195286");

		payService.rechargeStep2(step2);
	}

}
