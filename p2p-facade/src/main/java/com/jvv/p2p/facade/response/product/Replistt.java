package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class Replistt {

	@Element("billinfos")
	private Billinfos billinfos;

	public Billinfos getBillinfos() {
		return billinfos;
	}

	public void setBillinfos(Billinfos billinfos) {
		this.billinfos = billinfos;
	}
}
