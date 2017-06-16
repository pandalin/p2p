package com.jvv.p2p.integrate.longkin.impl;

import java.io.IOException;
import java.io.StringReader;

import javax.inject.Inject;
import javax.inject.Named;

import org.xmappr.Xmappr;

import com.google.common.collect.ImmutableMap;
import com.jvv.p2p.facade.request.ExperienceInvestRequest;
import com.jvv.p2p.facade.request.ExperienceQryRequest;
import com.jvv.p2p.facade.request.ExperienceRecordRequest;
import com.jvv.p2p.facade.request.Experiencereplist;
import com.jvv.p2p.facade.request.RequestHead;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.product.ExperienceAppDetail;
import com.jvv.p2p.facade.response.product.ExperienceRecord;
import com.jvv.p2p.facade.response.product.ExperienceTenderRecord;
import com.jvv.p2p.integrate.longkin.LkClient;
import com.jvv.p2p.integrate.longkin.LkExperienceService;
import com.jvv.p2p.integrate.longkin.ResultConvert;
import com.jvv.p2p.integrate.longkin.response.LkResponse;
@Named
public class LkExperienceServiceImpl implements LkExperienceService {
	@Inject
	private LkClient lkClient;

	@Inject
	private ResultConvert resultConvert;
	@Override
	public ExperienceTenderRecord queryExperienceList(ExperienceQryRequest query) throws IOException {
		final String service = "longkin.invest.m_experience_list";
		RequestHead head = new RequestHead(service);
		if (query == null) {
			query = new ExperienceQryRequest();
		}
		LkResponse response = (LkResponse) lkClient.send(head, query);
		ExperienceTenderRecord body = new ExperienceTenderRecord();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(ExperienceTenderRecord.class);
			body = (ExperienceTenderRecord) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;
	}

	@Override
	public ExperienceAppDetail experienceappDetail(String id) throws IOException {
		String command = "longkin.invest.m_experience_detail";
		RequestHead head = new RequestHead(command);
		LkResponse response = (LkResponse)lkClient.send(head, null,ImmutableMap.of("id" , id));
		ExperienceAppDetail body = new ExperienceAppDetail();
		if (response.isSuc()) {
			String bodyxml = response.getBody();

			Xmappr xm = new Xmappr(ExperienceAppDetail.class);
			body = (ExperienceAppDetail) xm.fromXML(new StringReader(bodyxml));
		}
		body.setResult(resultConvert.convert(response.getHead()));
		return body;
	}

	@Override
	public Result experienceInvest(ExperienceInvestRequest request) throws IOException {
		String command = "longkin.invest.m_invest_receiveexperiencetrade";
		RequestHead head = new RequestHead(command);
		LkResponse response = lkClient.send(head, request);
		if (response == null || response.getHead() == null) {
			throw new IOException("隆金宝服务器 无返回.");
		}
		Result result = resultConvert.convert(response.getHead());

		return result;
	}

	@Override
	public ExperienceRecord investRecord(ExperienceRecordRequest req) throws IOException {
		String service = "longkin.invest.m_experience_detail_record";
		RequestHead head = new RequestHead(service);
		LkResponse response = lkClient.send(head, req );
		ExperienceRecord recored = null;
		if(response.isSuc())
		{
			Xmappr xm = new Xmappr(ExperienceRecord.class);
			recored = (ExperienceRecord)xm.fromXML(new StringReader(response.getBody()));
		}else
		{
			recored = new ExperienceRecord();
		}
		
		recored.setResult(resultConvert.convert(response.getHead()));
		
		return recored;
	}

	@Override
	public Experiencereplist experienceReplist(String experId) throws IOException {
		String service = "longkin.invest.m_experience_detail_replist";
		RequestHead head = new RequestHead(service);
		LkResponse response = lkClient.send(head, null , ImmutableMap.of("experid" , experId));
		Experiencereplist replist = null;
		
		if(response.isSuc())
		{
			Xmappr xm = new Xmappr(Experiencereplist.class);
			replist = (Experiencereplist)xm.fromXML(new StringReader(response.getBody()));
		}else
		{
			replist = new Experiencereplist();
		}
		
		replist.setResult(resultConvert.convert(response.getHead()));
		
		return replist;
	}
	
}
