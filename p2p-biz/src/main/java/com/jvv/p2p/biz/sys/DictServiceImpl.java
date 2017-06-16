package com.jvv.p2p.biz.sys;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import com.jvv.p2p.facade.DictService;
import com.jvv.p2p.facade.em.BankType;
import com.jvv.p2p.facade.request.FujianRequest;
import com.jvv.p2p.facade.request.RegionRequest;
import com.jvv.p2p.facade.response.account.BankList;
import com.jvv.p2p.facade.response.sys.Count;
import com.jvv.p2p.facade.response.sys.Fujian;
import com.jvv.p2p.facade.response.sys.Regioninfots;
import com.jvv.p2p.integrate.longkin.LkCountService;
import com.jvv.p2p.integrate.longkin.LkDictService;
import com.jvv.p2p.integrate.longkin.LkFujianService;

@Named("dictService")
public class DictServiceImpl implements DictService {

	@Inject
	private LkDictService lkDictService;

	@Inject
	private LkFujianService lkFujianService;
	
	@Inject
	private LkCountService lkCountService;

	@Override
	public BankList getBankList(BankType bankType) throws IOException {
		return lkDictService.getBankList(bankType);
	}

	@Override
	public Regioninfots getRegionList(RegionRequest request) throws IOException {
		return lkDictService.getRegionList(request);
	}

	@Override
	public Fujian download(FujianRequest request) throws Exception {
		return lkFujianService.download(request);
	}

	@Override
	public Count statistics() throws IOException {
		return lkCountService.count();
	}

}
