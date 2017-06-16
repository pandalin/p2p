package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class UrlString {

	@Element("string")
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
