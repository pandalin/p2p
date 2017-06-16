package com.jvv.p2p.facade.response.pay;

import org.xmappr.Element;

import com.jvv.p2p.facade.response.Result;

public class Sinajyt {

	@Element("sinajys")
	private Sinajys sinajys;

	

	public Sinajys getSinajys() {
		return sinajys;
	}

	public void setSinajys(Sinajys sinajys) {
		this.sinajys = sinajys;
	}

}
