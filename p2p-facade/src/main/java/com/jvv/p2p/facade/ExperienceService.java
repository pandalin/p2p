package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

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
@WebService
public interface ExperienceService {
	/**
	 * 查询体验标列表
	 * 
	 * */
	@WebMethod
	ExperienceTenderRecord queryExperienceList(ExperienceQryRequest query) throws IOException;
	
	
	/**
	 * 查询一个体验标
	 * **/
	ExperienceAppInfo get() throws IOException;
	
	
	
	/**体验标详情
	 * @param id 体验标项目id
	 */
	ExperienceAppDetail experienceappDetail(String id)throws IOException;
	
	/**
	 * 体验标投资
	 * @param request
	 */
	Result experienceInvest(ExperienceInvestRequest request)throws IOException;
	
	
	/**
	 * 体验标投资记录
	 * **/
	
	ExperienceRecord investRecord(ExperienceRecordRequest req) throws IOException;
	
	/**
	 * 查询用户体验金红包
	 * **/
	public RedPoint experienceRedPoint(RedpointQryRequest request) throws IOException;
	
	/**
	 * 领取体验金
	 * **/
	public Result receiveExperience(String loginUid, String redpointId) throws IOException;
	
	/**
	 * 
	 * 体验标还款计划
	 * **/
	Experiencereplist experienceReplist(String experId)throws IOException;
}
