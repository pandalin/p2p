package com.jvv.p2p.test.integrate;

import java.io.IOException;
import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;

import com.jvv.p2p.facade.em.MyInvestType;
import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.request.MyRepayQryRequest;
import com.jvv.p2p.integrate.longkin.LkOrderService;

public class LkOrderServiceTest extends P2pBaseTest {

	@Inject
	private LkOrderService service;

	@Test
	public void a() {
		MyInvestQryRequest request = new MyInvestQryRequest();
		request.setLoginUid(loginUid);
		request.setPagesize(20);
		request.setType(MyInvestType.backing.getValue());
		try {
			service.queryMyInvest(request);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void b() {
		MyRepayQryRequest request = new MyRepayQryRequest();
		request.setLoginUid(loginUid);
		request.setsDateStart(new Date());

		try {
			service.queryMyRepay(request);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
