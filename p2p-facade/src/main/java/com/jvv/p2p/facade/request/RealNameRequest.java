package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class RealNameRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
realname	真实姓名	String (50)	真实姓名	要签	非空	
cert_no	证件号码	String (50)	证件号码	要签	非空	500226…
	 */
	
	@Title("login_uid")
	private String loginUid;
	@Title("realname")
	private String realname;
	@Title("cert_no")
	private String certNo;
	
	public String getLoginUid() {
		return loginUid;
	}
	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
}
