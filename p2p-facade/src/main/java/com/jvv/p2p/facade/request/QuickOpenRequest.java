package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class QuickOpenRequest {

	/*
	phone	手机号	String(11)	手机号
	password	密码	String(100)	密码
	smscode	验证码	String(20)	验证码
	realname	姓名	String(20)	姓名
	cert_no	身份证号	String(10)	身份证号
	 */

	@Title("phone")
	private String phone;

	@Title("password")
	private String password;
	@Title("realname")
	private String realname;
	@Title("cert_no")
	private String certNo;
	@Title("smscode")
	private String smscode;
	
	private String userId;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}


	public String getSmscode() {
		return smscode;
	}

	public void setSmscode(String smscode) {
		this.smscode = smscode;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
