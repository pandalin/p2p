package com.jvv.p2p.facade.response.account;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement("redpointlist")
public class RedpointList {
	@Element(name="redpointinfos")
	private RedpointInfos redpointInfos;

	public RedpointInfos getRedpointInfos() {
		return redpointInfos;
	}

	public void setRedpointInfos(RedpointInfos redpointInfos) {
		this.redpointInfos = redpointInfos;
	}
	
}
