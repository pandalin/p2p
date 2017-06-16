package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class Tradeinfo {

	@Element
	private Trade trade;

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}
}
