package com.jvv.p2p.test.biz;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.Test;

import com.google.common.eventbus.EventBus;
import com.jvv.p2p.biz.EventType;
import com.jvv.p2p.biz.pay.InvestService;
import com.jvv.p2p.biz.pay.InvestTaskService;
import com.jvv.p2p.facade.PayService;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.test.BaseTest;

public class PayTest extends BaseTest {
	@Inject
	private InvestService investService;
	@Inject
	private InvestTaskService InvestTaskService;
	
	@Inject
	private PayService payService;
	
	
	public void a() {
		InvestRequest invest=new InvestRequest();
		invest.setOverinvestamount(BigDecimal.valueOf(123));
		
		EventBus event = new EventBus(EventType.invest.name());
		event.register(investService);
		event.post(invest);
		
		EventBus event2 = new EventBus(EventType.invest.name());
		event2.register(InvestTaskService);
		event2.post(invest);
	}
	
	@Test
	public void b(){
		InvestRequest invest=new InvestRequest();
		invest.setOverinvestamount(BigDecimal.valueOf(123));
		invest.setLoginUid("123");
		invest.setTradeid("1");
	
		try {
			payService.invest(invest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
