package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.xmappr.Xmappr;

import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.request.ProductTradeQry;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.product.Replist;
import com.jvv.p2p.facade.response.product.TenderRecord;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkProductService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

@Named
public class LkProductServiceImpl implements LkProductService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public TradeInvest query(ProductQryRequest qry) throws IOException {
		final String smsCommand = "longkin.invest.m_invest_trade_list";

		RequestHead head = new RequestHead(smsCommand);
		if (qry == null) {
			qry = new ProductQryRequest();
		}

		if (qry.getPagesize() == null) {
			qry.setPagesize(LkClient.DEFAULT_PAGE_SIZE);
		}
		LkResponse response = (LkResponse) lkClient.send(head, qry);

		TradeInvest body = null;
		if (response.isSuc()) {

			String bodyxml = response.getBody();
			Xmappr xm = new Xmappr(TradeInvest.class);
			body = (TradeInvest) xm.fromXML(new StringReader(bodyxml));

			//TODO fix

		} else {
			body = new TradeInvest();

		}

		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@SuppressWarnings("serial")
	@Override
	public Tradeallinfo get(final String productId) throws IOException {
		final String smsCommand = "longkin.invest.m_invest_trade_detil";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				if (StringUtils.isNotEmpty(productId)) {
					put("id", productId);
				}
			}
		});

		String bodyxml = response.getBody();
		Tradeallinfo body = new Tradeallinfo();
		if (response.isSuc()) {

			Xmappr xm = new Xmappr(Tradeallinfo.class);
			body = (Tradeallinfo) xm.fromXML(new StringReader(bodyxml));
//			BigDecimal selfRate = body.getDemandinfo().getDemandinfot().getSelfRate();
//			if (selfRate != null && BigDecimal.ZERO.compareTo(selfRate) < 0) {
//				body.getTradeinfo().getTrade().setInterestRate(selfRate);
//			}
		}
		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@Override
	public TenderRecord getTradeRecord(ProductTradeQry qry) throws IOException {

		final String command = "longkin.invest.m_invest_trade_tender_record";
		RequestHead head = new RequestHead(command);

		LkResponse response = (LkResponse) lkClient.send(head, qry);
		TenderRecord body = new TenderRecord();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(TenderRecord.class);
			body = (TenderRecord) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;

	}

	@SuppressWarnings("serial")
	@Override
	public Replist getTradeReplist(final String tradeId) throws IOException {
		final String smsCommand = "longkin.invest.m_invest_trade_replist";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{

				put("tradeid", tradeId);

			}
		});

		Replist body = new Replist();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Replist.class);
			body = (Replist) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;
	}

}
