package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class ExperienceTenderList {
	@Element("experienceappinfos")
	private ExperienceAppInfos experienceappInfos;

	public ExperienceAppInfos getExperienceappInfos() {
		return experienceappInfos;
	}

	public void setExperienceappInfos(ExperienceAppInfos experienceappInfos) {
		this.experienceappInfos = experienceappInfos;
	}
}
