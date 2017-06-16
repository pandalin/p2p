package com.jvv.p2p.facade.response.user;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

/**
 * 
 * 登录
 * 
 * Created by cx on 2015/5/25.
 */

@RootElement("userallinfot")
public class Userallinfot {
	
	@Element
	private Userbase userbase;

	transient private Result result;

	public Userbase getUserbase() {
		return userbase;
	}

	public void setUserbase(Userbase userbase) {
		this.userbase = userbase;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
