package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class Experiencetzs {
	@Element(name="experiencetz" , targetType=ExperienceDetailInfoT.class)
	private List<ExperienceDetailInfoT> experiencetzs;

	public List<ExperienceDetailInfoT> getExperiencetzs() {
		return experiencetzs;
	}

	public void setExperiencetzs(List<ExperienceDetailInfoT> experiencetzs) {
		this.experiencetzs = experiencetzs;
	}
	
}
