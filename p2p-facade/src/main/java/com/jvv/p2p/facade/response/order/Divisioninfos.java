package com.jvv.p2p.facade.response.order;

import java.util.List;

import org.xmappr.Element;

public class Divisioninfos {

	@Element(name = "divisioninfo", targetType = Divisioninfo.class)
	private List<Divisioninfo> divisioninfo;

	public List<Divisioninfo> getDivisioninfo() {
		return divisioninfo;
	}

	public void setDivisioninfo(List<Divisioninfo> divisioninfo) {
		this.divisioninfo = divisioninfo;
	}
}
