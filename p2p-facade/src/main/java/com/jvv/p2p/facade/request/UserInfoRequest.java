package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class UserInfoRequest {
	@Title("login_uid")
	private String loginUid;
	@Title("username")
	private String username;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
