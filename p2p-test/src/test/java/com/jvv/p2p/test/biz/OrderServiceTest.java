package com.jvv.p2p.test.biz;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.OrderService;
import com.jvv.p2p.facade.em.MyInvestType;
import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.response.order.MyInvest;
import com.jvv.p2p.test.integrate.P2pBaseTest;

public class OrderServiceTest extends P2pBaseTest {

	@Inject
	OrderService orderService;

	@Test
	public void a() {
		MyInvestQryRequest request = new MyInvestQryRequest();
		request.setLoginUid(loginUid);
		request.setPagesize(10);
		request.setType(MyInvestType.all.getValue());
		try {
			MyInvest invest=orderService.queryMyInvest(request);
			if(invest.getResult().isSuc()){
				log.debug(ToStringBuilder.reflectionToString(invest.getTradedetailviewinfotlist().getTradedetailviewinfos().getTradedetailviewinfo().get(0).getTrade()));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
