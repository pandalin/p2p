package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.google.common.collect.ImmutableMap;
import com.jvv.p2p.facade.request.RedpointQryRequest;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.RedPoint;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkRedPointService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;

@Named
public class LkRedPointServiceImpl implements LkRedPointService {
	private String type = "tyj";  //红包只查询体验金红包
	
	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;
	@Override
	public RedPoint list(RedpointQryRequest request) throws IOException {
		String service = "longkin.user.m_my_redpoint_list";
		RequestHead head = new RequestHead(service);
		LkResponse response = (LkResponse) lkClient.send(head, request );
		RedPoint body = null;;
		if (response.isSuc()) {

			String bodyxml = response.getBody();
			Xmappr xm = new Xmappr(RedPoint.class);
			body = (RedPoint) xm.fromXML(new StringReader(bodyxml));

			//TODO fix

		} else {
			body = new RedPoint();

		}

		body.setResult(resultConvert.convert(response.getHead()));

		return body;
		
	}
	@Override
	public Result receiveExperience(String loginUid, String redpointId) throws IOException {
		String service = "longkin.user.m_receiveexperience";
		RequestHead head = new RequestHead(service);
		LkResponse response = (LkResponse) lkClient.send(head, null , ImmutableMap.of("login_uid",loginUid,"redpointid" , redpointId));
		return resultConvert.convert(response.getHead());
	}

}
