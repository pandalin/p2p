package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;

public class Dborhgprofilelist {

	@Element(name = "strings", targetType = UrlString.class)
	private List<UrlString> strings;

	public List<UrlString> getStrings() {
		return strings;
	}

	public void setStrings(List<UrlString> strings) {
		this.strings = strings;
	}
}
