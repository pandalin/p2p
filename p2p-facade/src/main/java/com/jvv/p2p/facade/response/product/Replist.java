package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement
public class Replist {

	@Element("replist")
	private Replistt replistt;

	transient private Result result;

	public Replistt getReplistt() {
		return replistt;
	}

	public void setReplistt(Replistt replistt) {
		this.replistt = replistt;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
