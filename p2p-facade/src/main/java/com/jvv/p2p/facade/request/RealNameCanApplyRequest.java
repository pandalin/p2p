package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class RealNameCanApplyRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	 */
	@Title("login_uid")
	private String loginUid;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}
}
