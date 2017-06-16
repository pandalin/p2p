package com.jvv.p2p.facade.response.account;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement("redpointinfos")
public class RedpointInfos {
	@Element(name="redpointinfo" , targetType=RedpointInfo.class)
	private List<RedpointInfo> redpointInfos;

	public List<RedpointInfo> getRedpointInfos() {
		return redpointInfos;
	}

	public void setRedpointInfos(List<RedpointInfo> redpointInfos) {
		this.redpointInfos = redpointInfos;
	}
	
}
