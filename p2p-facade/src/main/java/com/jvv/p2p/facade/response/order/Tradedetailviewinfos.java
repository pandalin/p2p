package com.jvv.p2p.facade.response.order;

import java.util.List;

import org.xmappr.Element;

public class Tradedetailviewinfos {


	@Element(name="tradedetailviewinfo",targetType=Tradedetailviewinfo.class)
	private List<Tradedetailviewinfo> tradedetailviewinfo;

	public List<Tradedetailviewinfo> getTradedetailviewinfo() {
		return tradedetailviewinfo;
	}

	public void setTradedetailviewinfo(List<Tradedetailviewinfo> tradedetailviewinfo) {
		this.tradedetailviewinfo = tradedetailviewinfo;
	}
}
