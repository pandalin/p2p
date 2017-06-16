package com.jvv.p2p.facade.response.sys;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("regioninfots")
public class Regioninfots {

	@Element(name="regioninfot",targetType=Regioninfot.class)
	private List<Regioninfot> regioninfot;
	
	transient private Result result;

	public List<Regioninfot> getRegioninfot() {
		return regioninfot;
	}

	public void setRegioninfot(List<Regioninfot> regioninfot) {
		this.regioninfot = regioninfot;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
