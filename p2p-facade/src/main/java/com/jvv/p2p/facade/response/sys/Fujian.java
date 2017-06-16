package com.jvv.p2p.facade.response.sys;

import com.jvv.p2p.facade.response.Result;

public class Fujian {

	private byte[] filecontent;

	transient private Result result;

	public byte[] getFilecontent() {
		return filecontent;
	}

	public void setFilecontent(byte[] filecontent) {
		this.filecontent = filecontent;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
