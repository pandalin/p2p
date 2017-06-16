package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.em.BankType;
import com.jvv.p2p.facade.request.RegionRequest;
import com.jvv.p2p.facade.response.account.BankList;
import com.jvv.p2p.facade.response.sys.Regioninfots;

public interface LkDictService {

	/**
	 * 查询 银行列表
	 * 
	 * @param bankType
	 * @throws IOException
	 */
	BankList getBankList(BankType bankType) throws IOException;

	/**
	 * 查询 区域列表
	 * 
	 * @param request
	 * @throws IOException 
	 */
	Regioninfots getRegionList(RegionRequest request) throws IOException;
}
