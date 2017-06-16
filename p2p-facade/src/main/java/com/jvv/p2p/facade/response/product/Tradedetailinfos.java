package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class Tradedetailinfos {

	@Element(name="tradedetailinfo",targetType=Tradedetailinfo.class)
	private List<Tradedetailinfo> tradedetailinfo;

	public List<Tradedetailinfo> getTradedetailinfo() {
		return tradedetailinfo;
	}

	public void setTradedetailinfo(List<Tradedetailinfo> tradedetailinfo) {
		this.tradedetailinfo = tradedetailinfo;
	}
}
