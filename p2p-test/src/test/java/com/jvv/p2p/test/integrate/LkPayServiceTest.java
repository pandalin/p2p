package com.jvv.p2p.test.integrate;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.em.SerchTime;
import com.jvv.p2p.facade.em.SerchType;
import com.jvv.p2p.facade.request.ChargeQryRequest;
import com.jvv.p2p.facade.request.RechargeStep1Request;
import com.jvv.p2p.facade.request.RechargeStep2Request;
import com.jvv.p2p.facade.request.WithdrawRequest;
import com.jvv.p2p.facade.response.pay.Rechargequick;
import com.jvv.p2p.facade.response.pay.Sinacharge;
import com.jvv.p2p.facade.response.pay.WithdrawTradeno;
import com.jvv.p2p.integrate.longkin.LkPayService;

public class LkPayServiceTest extends P2pBaseTest {

	@Inject
	private LkPayService lkPayservice;

	@Test
	public void e() {
		ChargeQryRequest request = new ChargeQryRequest();
		request.setLoginUid(loginUid);
		request.setSerchtime(SerchTime.threemonth.name());
		request.setSerchtype(SerchType.sz.name());

		request.setZhtype("savingpot");
		request.setPagesize(86);

		try {
			Sinacharge sc = lkPayservice.queryCharge(request);
			log.debug(ToStringBuilder.reflectionToString(sc));

			log.debug(ToStringBuilder.reflectionToString(sc.getSinasz().getSinaszs().getSinasz()));

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void a() {

		RechargeStep1Request step1 = new RechargeStep1Request();
		step1.setLoginUid(loginUid);
		step1.setAmount(BigDecimal.valueOf(300));
		try {
			Rechargequick response = lkPayservice.rechargeStep1(step1);
			log.debug(ToStringBuilder.reflectionToString(response));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void b() {
		String smscode = "111111";

		RechargeStep2Request step2 = new RechargeStep2Request();

		step2.setLoginUid(loginUid);
		step2.setSmscode(smscode);
		step2.setTradeno("2015060109510828901148");

		try {
			lkPayservice.rechargeStep2(step2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void d() throws IOException {
		smsService.sendWithdrawSms(loginUid, "18602306750");
	}

	
	public void c() {
		WithdrawRequest request = new WithdrawRequest();
		request.setAmount(BigDecimal.valueOf(10));
		request.setLoginUid(loginUid);
		request.setCode("49021");

		try {
			WithdrawTradeno response = lkPayservice.withdraw(request);
			log.debug(ToStringBuilder.reflectionToString(response));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
