package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.jvv.p2p.facade.em.BankType;
import com.jvv.p2p.facade.request.RegionRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.account.BankList;
import com.jvv.p2p.facade.response.sys.Regioninfots;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkDictService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
import com.jvv.p2p.util.XmlUtil;

@Named
public class LKDictServiceImpl implements LkDictService {

	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;

	@SuppressWarnings("serial")
	@Override
	public BankList getBankList(final BankType bankType) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_bank_list";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, null, new HashMap<String, String>() {
			{
				put("bank_type", bankType.name());
			}
		});

		String bodyxml = response.getBody();

		Xmappr xm = new Xmappr(BankList.class);
		BankList body = (BankList) xm.fromXML(new StringReader(bodyxml));

		return body;

	}

	@Override
	public Regioninfots getRegionList(RegionRequest request) throws IOException {

		final String smsCommand = "longkin.user.m_sinapay_region_get";
		RequestHead head = new RequestHead(smsCommand);

		LkResponse response = (LkResponse) lkClient.send(head, request);

		String bodyxml = response.getBody();

		//解析body
		Regioninfots obj = new Regioninfots();
		if (response.isSuc()) {
			obj = XmlUtil.parse(bodyxml, Regioninfots.class);
		}

		obj.setResult(resultConvert.convert(response.getHead()));
		return obj;

	}

}
