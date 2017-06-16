package com.jvv.p2p.test.integrate;

import java.io.IOException;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.facade.em.BankType;
import com.jvv.p2p.facade.request.RegionRequest;
import com.jvv.p2p.facade.response.account.BankList;
import com.jvv.p2p.facade.response.account.Keyvalue;
import com.jvv.p2p.facade.response.sys.Regioninfot;
import com.jvv.p2p.facade.response.sys.Regioninfots;
import com.jvv.p2p.integrate.longkin.LkDictService;

public class LKDictServiceTest extends P2pBaseTest {

	@Inject
	private LkDictService lkDictService;

	@Test
	public void a() {
		try {
			BankList bl = lkDictService.getBankList(BankType.TX);

			for (Keyvalue kv : bl.getKeyvalue()) {

				log.debug(ToStringBuilder.reflectionToString(kv));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public void b() {
		RegionRequest request = new RegionRequest();

		try {
			Regioninfots obj = lkDictService.getRegionList(request);

			if (obj.getResult().isSuc()) {
				for (Regioninfot info : obj.getRegioninfot()) {
					log.debug(ToStringBuilder.reflectionToString(info));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
