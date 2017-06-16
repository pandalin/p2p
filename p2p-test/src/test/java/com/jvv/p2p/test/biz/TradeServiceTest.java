package com.jvv.p2p.test.biz;

import javax.inject.Inject;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;

import com.jvv.p2p.biz.product.TradeService;
import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.test.BaseTest;

public class TradeServiceTest extends BaseTest {

	@Inject
	private TradeService tradeService;

	@Test
	public void a() {
		TradeDto t = tradeService.queryAd();

		log.debug(ToStringBuilder.reflectionToString(t));
		

	}
}
