package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class ExperienceTzList {
	@Element(name="experiencetzs" , targetType=Experiencetzs.class)
	private Experiencetzs experiencetzs;

	public Experiencetzs getExperiencetzs() {
		return experiencetzs;
	}

	public void setExperiencetzs(Experiencetzs experiencetzs) {
		this.experiencetzs = experiencetzs;
	}

	
	
}
