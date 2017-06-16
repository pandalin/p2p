package com.jvv.p2p.facade.response.pay;

import java.util.List;

import org.xmappr.Element;

public class Sinajys {

	@Element(name="sinajy",targetType=Sinajy.class)
	private List<Sinajy> sinajy;

	public List<Sinajy> getSinajy() {
		return sinajy;
	}

	public void setSinajy(List<Sinajy> sinajy) {
		this.sinajy = sinajy;
	}
}
