package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.request.MyRepayQryRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.order.MyInvest;
import com.jvv.p2p.facade.response.order.MyRepay;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkOrderService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

@Named
public class LkOrderServiceImpl implements LkOrderService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public MyInvest queryMyInvest(MyInvestQryRequest request) throws IOException {
		final String command = "longkin.trade.m_trade_my_invest_get";
		RequestHead head = new RequestHead(command);

		LkResponse response = (LkResponse) lkClient.send(head, request);
		MyInvest body = new MyInvest();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(MyInvest.class);
			body = (MyInvest) xm.fromXML(new StringReader(bodyxml));
		}

		body.setResult(resultConvert.convert(response.getHead()));

		return body;
	}

	@Override
	public MyRepay queryMyRepay(MyRepayQryRequest request) throws IOException {
		final String smsCommand = "longkin.trade.m_trade_my_repaylist_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, request);

		String bodyxml = response.getBody();

		Xmappr xm = new Xmappr(MyRepay.class);
		MyRepay body = (MyRepay) xm.fromXML(new StringReader(bodyxml));

		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}
}
