package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.ExperienceInvestRequest;
import com.jvv.p2p.facade.request.ExperienceQryRequest;
import com.jvv.p2p.facade.request.ExperienceRecordRequest;
import com.jvv.p2p.facade.request.Experiencereplist;
import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.product.ExperienceAppDetail;
import com.jvv.p2p.facade.response.product.ExperienceRecord;
import com.jvv.p2p.facade.response.product.ExperienceTenderRecord;

/**
 * 隆金宝体验标服务层
 * @author cqg
 *
 */
public interface LkExperienceService {
	/**
	 * 查询体验标列表
	 * */
	ExperienceTenderRecord queryExperienceList(ExperienceQryRequest query) throws IOException;
	
	
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
	 * 体验标项目投标记录
	 * @throws IOException
	*
	*/
	ExperienceRecord investRecord(ExperienceRecordRequest req) throws IOException;
	
	
	/**
	 * 
	 * 体验标还款计划
	 * **/
	Experiencereplist experienceReplist(String experId)throws IOException;
}
