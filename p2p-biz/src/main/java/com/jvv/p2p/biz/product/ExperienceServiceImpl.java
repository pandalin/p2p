package com.jvv.p2p.biz.product;


import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.util.Assert;

import com.jvv.p2p.biz.pay.InvestService;
import com.jvv.p2p.entity.TradeFlowDto;
import com.jvv.p2p.facade.ExperienceService;
import com.jvv.p2p.facade.LoginUidService;
import com.jvv.p2p.facade.em.ExperienceTradeStatus;
import com.jvv.p2p.facade.em.RedpointType;
import com.jvv.p2p.facade.request.ExperienceInvestRequest;
import com.jvv.p2p.facade.request.ExperienceQryRequest;
import com.jvv.p2p.facade.request.ExperienceRecordRequest;
import com.jvv.p2p.facade.request.Experiencereplist;
import com.jvv.p2p.facade.request.RedpointQryRequest;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.RedPoint;
import com.jvv.p2p.facade.response.product.ExperienceAppDetail;
import com.jvv.p2p.facade.response.product.ExperienceAppInfo;
import com.jvv.p2p.facade.response.product.ExperienceRecord;
import com.jvv.p2p.facade.response.product.ExperienceTenderRecord;
import com.jvv.p2p.integrate.longkin.LkExperienceService;
import com.jvv.p2p.integrate.longkin.LkRedPointService;

@Named("experienceService")
public class ExperienceServiceImpl implements ExperienceService {
	
	@Inject
	LkExperienceService experService;
	@Inject
	LkRedPointService rpService;
	@Inject
	InvestService investService;
	@Inject
	private LoginUidService loginUidService;
	@Override
	public ExperienceTenderRecord queryExperienceList(ExperienceQryRequest query) throws IOException {
		return experService.queryExperienceList(query);
	}
	@Override
	public Result experienceInvest(ExperienceInvestRequest request) throws IOException {
		// TODO Auto-generated method stub
		try{
			Assert.notNull(request);
			Assert.notNull(request.getTradeId(), "tradeId is null");
			Assert.notNull(request.getLoginUid(),"loginUid is null");
			Assert.notNull(request.getCode(), "code is null");
		}catch(IllegalArgumentException ex){
			throw new IOException(ex.getMessage());
		}
		Result result = experService.experienceInvest(request);
		if(null != result && result.isSuc())  //投资成功 ，记录流水
		{
			TradeFlowDto flow = new TradeFlowDto();
			flow.setAmount(request.getInvestAmount());
			flow.setExtTradeId(request.getTradeId());

			flow.setExtUserId(loginUidService.getIdByLoginUid(request.getLoginUid()));

			investService.insert(flow);

		}
		return result;
	}
	@Override
	public RedPoint experienceRedPoint(RedpointQryRequest request) throws IOException {
		// TODO Auto-generated method stub
		try {
			Assert.notNull(request.getLoginUid(), "loginUid is null");
			request.setType(RedpointType.tyj.name());
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}
		return rpService.list(request);
	}
	@Override
	public Result receiveExperience(String loginUid, String redpointId) throws IOException{
		try {
			Assert.notNull(loginUid, "loginUid is null");
			Assert.notNull(redpointId, "redpointId is null");
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}
		return rpService.receiveExperience(loginUid, redpointId);
	}
	@Override
	public ExperienceAppDetail experienceappDetail(String id) throws IOException {
		try {
			Assert.notNull(id, "id is null");
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}
		return experService.experienceappDetail(id);
	}
	@Override
	public ExperienceRecord investRecord(ExperienceRecordRequest req) throws IOException {
		try {
			Assert.notNull(req);
			Assert.notNull(req.getTradeId(),"tradeId is null");
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}
		return experService.investRecord(req);
	}
	@Override
	public ExperienceAppInfo get() throws IOException {
		ExperienceQryRequest req = new ExperienceQryRequest();
		req.setTradeStatus(ExperienceTradeStatus.caninvest.getValue());  //获取投标中的
		req.setPage(1);
		req.setPageSize(1);
		ExperienceTenderRecord record  = experService.queryExperienceList(req);
		if(record.getResult().isSuc())
		{
			try {
				Assert.notEmpty(record.getExperienceTenderList().getExperienceappInfos().getExperienceAppInfos());
				return record.getExperienceTenderList().getExperienceappInfos().getExperienceAppInfos().get(0);
			} catch (IllegalArgumentException e) {
				return null;
			}
		}
		return null;
	}
	@Override
	public Experiencereplist experienceReplist(String experId) throws IOException {
		try {
			Assert.notNull(experId, "experId is null");
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage());
		}
		return experService.experienceReplist(experId);
	}

}
