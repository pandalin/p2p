package com.jvv.p2p.facade.response.account;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("keyvalues")
public class BankList {

	@Element(name = "keyvalue", targetType = Keyvalue.class)
	private List<Keyvalue> keyvalue;

	transient private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public List<Keyvalue> getKeyvalue() {
		return keyvalue;
	}

	public void setKeyvalue(List<Keyvalue> keyvalue) {
		this.keyvalue = keyvalue;
	}
}
