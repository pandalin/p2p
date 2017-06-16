package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class Billinfos {

	@Element(name = "billinfo", targetType = Billinfo.class)
	private List<Billinfo> billinfo;

	public List<Billinfo> getBillinfo() {
		return billinfo;
	}

	public void setBillinfo(List<Billinfo> billinfo) {
		this.billinfo = billinfo;
	}

}
