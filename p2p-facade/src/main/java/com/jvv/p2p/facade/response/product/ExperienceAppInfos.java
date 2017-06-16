package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class ExperienceAppInfos {
	@Element(name = "experienceappinfo", targetType = ExperienceAppInfo.class)
	private List<ExperienceAppInfo> experienceAppInfos;

	public List<ExperienceAppInfo> getExperienceAppInfos() {
		return experienceAppInfos;
	}

	public void setExperienceAppInfos(List<ExperienceAppInfo> experienceAppInfos) {
		this.experienceAppInfos = experienceAppInfos;
	}
	
	
}
