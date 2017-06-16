package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class RechargeStep2Request {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	   tradeno	订单号	String(50)	订单号	要签	非空	
	   smscode	短信验证码	String(50)	短信验证码	要签	非空	
	 */

	@Title("login_uid")
	private String loginUid;
	@Title("tradeno")
	private String tradeno;
	@Title("smscode")
	private String smscode;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getTradeno() {
		return tradeno;
	}

	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}

	public String getSmscode() {
		return smscode;
	}

	public void setSmscode(String smscode) {
		this.smscode = smscode;
	}

}
