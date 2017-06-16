package com.jvv.p2p.facade.response.pay;

import org.xmappr.RootElement;
import org.xmappr.Text;

import com.jvv.p2p.facade.response.Result;

@RootElement("string")
public class WithdrawTradeno {

	@Text
	private String tradeno;

	transient private Result result;

	public String getTradeno() {
		return tradeno;
	}

	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
