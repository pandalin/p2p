package com.jvv.p2p.facade;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jvv.p2p.facade.em.BankType;
import com.jvv.p2p.facade.request.FujianRequest;
import com.jvv.p2p.facade.request.RegionRequest;
import com.jvv.p2p.facade.response.account.BankList;
import com.jvv.p2p.facade.response.sys.Count;
import com.jvv.p2p.facade.response.sys.Fujian;
import com.jvv.p2p.facade.response.sys.Regioninfots;

@WebService
public interface DictService {

	/**
	 * 查询 银行列表
	 * 
	 * @param bankType
	 * @throws IOException
	 */
	@WebMethod
	BankList getBankList(BankType bankType) throws IOException;

	/**
	 * 查询 区域列表
	 * 
	 * @param request
	 * @throws IOException
	 */
	@WebMethod
	Regioninfots getRegionList(RegionRequest request) throws IOException;

	/**
	 * 下载附件
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@WebMethod
	Fujian download(FujianRequest request) throws Exception;

	/**
	 * 查询平台统计数据
	 * 
	 * @return
	 * @throws IOException
	 */
	@WebMethod
	Count statistics() throws IOException;
}
