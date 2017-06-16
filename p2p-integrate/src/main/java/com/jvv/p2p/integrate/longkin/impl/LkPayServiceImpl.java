package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.jvv.p2p.facade.request.ChargeQryRequest;
import com.jvv.p2p.facade.request.InvestRequest;
import com.jvv.p2p.facade.request.RechargeStep1Request;
import com.jvv.p2p.facade.request.RechargeStep2Request;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.request.WithdrawRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.pay.Rechargequick;
import com.jvv.p2p.facade.response.pay.Sinacharge;
import com.jvv.p2p.facade.response.pay.WithdrawTradeno;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkPayService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

/**
 * 
 * @author cx
 *
 */
@Named
public class LkPayServiceImpl implements LkPayService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@Override
	public Result invest(InvestRequest invest) throws IOException {
		final String smsCommand = "longkin.trade.m_trade_my_charge_invest_do";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, invest);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}

		Result result = resultConvert.convert(response.getHead());

		return result;
	}

	@Override
	public Rechargequick rechargeStep1(RechargeStep1Request step1) throws IOException {

		final String smsCommand = "longkin.trade.m_trade_my_recharge_do";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, step1);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}
		Rechargequick body = new Rechargequick();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Rechargequick.class);
			body = (Rechargequick) xm.fromXML(new StringReader(bodyxml));
		}

		body.setResult(resultConvert.convert(response.getHead()));
		return body;

	}

	@Override
	public Result rechargeStep2(RechargeStep2Request step2) throws IOException {
		final String smsCommand = "longkin.trade.m_trade_my_recharge_do_two";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, step2);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}

		Result result = resultConvert.convert(response.getHead());

		return result;

	}

	@Override
	public WithdrawTradeno withdraw(WithdrawRequest request) throws IOException {
		final String smsCommand = "longkin.trade.m_trade_my_withdraw_do";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = lkClient.send(head, request);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}
		WithdrawTradeno body = new WithdrawTradeno();
		if (response.isSuc()) {

			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(WithdrawTradeno.class);
			body = (WithdrawTradeno) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));

		return body;

	}

	@Override
	public Sinacharge queryCharge(ChargeQryRequest request) throws IOException {
		final String command = "longkin.trade.m_trade_my_charge_get";
		RequestHead head = new RequestHead(command);

		LkResponse response = lkClient.send(head, request);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}

		Sinacharge body = new Sinacharge();
		if (response.isSuc()) {

			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(Sinacharge.class);
			body = (Sinacharge) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;
	}

}
