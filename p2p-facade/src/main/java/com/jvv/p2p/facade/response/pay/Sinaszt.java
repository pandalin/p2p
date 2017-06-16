package com.jvv.p2p.facade.response.pay;

import org.xmappr.Element;

public class Sinaszt {

	@Element("sinaszs")
	private Sinaszs sinaszs;

	public Sinaszs getSinaszs() {
		return sinaszs;
	}

	public void setSinaszs(Sinaszs sinaszs) {
		this.sinaszs = sinaszs;
	}
}
