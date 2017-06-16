package com.jvv.p2p.facade.response.pay;

import java.util.List;

import org.xmappr.Element;

public class Sinaszs {

	@Element(name = "sinasz", targetType = Sinasz.class)
	private List<Sinasz> sinasz;

	public List<Sinasz> getSinasz() {
		return sinasz;
	}

	public void setSinasz(List<Sinasz> sinasz) {
		this.sinasz = sinasz;
	}

}
