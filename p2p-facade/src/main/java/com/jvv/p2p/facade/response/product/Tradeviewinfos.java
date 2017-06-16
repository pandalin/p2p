package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class Tradeviewinfos {
	
	
	@Element(targetType=Tradeviewinfo.class)
	private List<Tradeviewinfo> tradeviewinfo;

	public List<Tradeviewinfo> getTradeviewinfo() {
		return tradeviewinfo;
	}

	public void setTradeviewinfo(List<Tradeviewinfo> tradeviewinfo) {
		this.tradeviewinfo = tradeviewinfo;
	}

	
}
