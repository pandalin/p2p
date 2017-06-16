package com.jvv.p2p.facade.response.sys;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;
import com.jvv.p2p.facade.response.account.Keyvalue;

@RootElement("keyvalues")
public class Count {

	@Element(name = "keyvalue", targetType = Keyvalue.class)
	private List<Keyvalue> keyvalue;

	transient private Result result;

	public List<Keyvalue> getKeyvalue() {
		return keyvalue;
	}

	public void setKeyvalue(List<Keyvalue> keyvalue) {
		this.keyvalue = keyvalue;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
