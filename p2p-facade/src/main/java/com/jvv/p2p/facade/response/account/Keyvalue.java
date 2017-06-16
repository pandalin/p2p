package com.jvv.p2p.facade.response.account;

import org.xmappr.Element;

public class Keyvalue {

	@Element
	private String key;
	@Element
	private String value;
	@Element
	private String banklog;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getBanklog() {
		return banklog;
	}

	public void setBanklog(String banklog) {
		this.banklog = banklog;
	}
}
