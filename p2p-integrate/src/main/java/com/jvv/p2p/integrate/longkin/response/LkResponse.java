package com.jvv.p2p.integrate.longkin.response;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement(name = "response")
public class LkResponse {

	@Element
	private ResponseHead head;

	private String body;

	public boolean isSuc() {
		if (head != null) {
			return this.getHead().isSuc();
		}
		return false;
	}

	public ResponseHead getHead() {
		return head;
	}

	public void setHead(ResponseHead head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
