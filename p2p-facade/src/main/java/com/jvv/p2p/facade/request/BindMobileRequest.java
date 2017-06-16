package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class BindMobileRequest {
	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	phone	手机号	String(11)	手机号	要签	非空	13412345678
	code	验证码	String(10)	短信验证码	要签	非空	546745
	 */

	@Title("login_uid")
	private String loginUid;

	@Title("phone")
	private String phone;

	@Title("code")
	private String code;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
