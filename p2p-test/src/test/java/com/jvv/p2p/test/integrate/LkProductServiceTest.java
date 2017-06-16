package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.request.ProductTradeQry;
import com.jvv.p2p.facade.response.product.Replist;
import com.jvv.p2p.facade.response.product.Trade;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;
import com.jvv.p2p.integrate.longkin.LkProductService;

public class LkProductServiceTest extends P2pBaseTest {

	@Inject
	private LkProductService service;

	
	public void e() throws IOException {
		Replist rp=service.getTradeReplist("1");
	}


	
	public void a() {
		ProductQryRequest qry = new ProductQryRequest();
		qry.setListcode("caninvest");
		qry.setIsnonovice("1");
		qry.setPagesize(100);
		
		try {
			TradeInvest tradeInvest = service.query(qry);
			log.debug(ToStringBuilder.reflectionToString(tradeInvest));

			log.debug(tradeInvest.getTradeviewinfotlist().getTradeviewinfos().getTradeviewinfo().get(0).getInvestStartDate());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void b() {
		try {
			Tradeallinfo tradeallinfo = service.get("1");
			if (tradeallinfo.getResult().isSuc()) {
				Trade t = tradeallinfo.getTradeinfo().getTrade();
				log.debug(t.getPerlen());
				log.debug(t.getBtnstyle());
				
				log.debug(tradeallinfo.getBusguaranteeinfo().getBusguaranteeinfot().getLoanPurpose());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void c() {
		ProductTradeQry qry = new ProductTradeQry();
		qry.setId("1");
		qry.setPage(2);
		qry.setPagesize(1);
		qry.setLoginUid(loginUid);
		try {
			service.getTradeRecord(qry);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
