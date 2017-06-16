package com.jvv.p2p.facade.response.user;

import org.xmappr.Element;

public class Userbaseinfot {
		
	@Element
	private Long id;
	
	@Element
	private String username;
	
	@Element
	private String realname;
	
	@Element("ischeck_realname")
	private String ischeckRealname;
	
	@Element("isactive_pay")
	private String isactivePay;
	
	@Element("phone")
	private String phone;
	
	@Element("isbind_phone")
	private String isbindPhone;
	
	@Element("isbind_email")
	private String isbindEmail;
	
	@Element("usertype")
	private Integer userType;
	
	@Element("secure_level")
	private Integer secureLevel;
	
	@Element("login_errornum")
	private Integer loginErrornum;
	
	@Element("status")
	private Integer status;
	
	@Element("isvalid")
	private Integer isvalid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIscheckRealname() {
		return ischeckRealname;
	}

	public void setIscheckRealname(String ischeckRealname) {
		this.ischeckRealname = ischeckRealname;
	}

	public String getIsactivePay() {
		return isactivePay;
	}

	public void setIsactivePay(String isactivePay) {
		this.isactivePay = isactivePay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsbindPhone() {
		return isbindPhone;
	}

	public void setIsbindPhone(String isbindPhone) {
		this.isbindPhone = isbindPhone;
	}

	public String getIsbindEmail() {
		return isbindEmail;
	}

	public void setIsbindEmail(String isbindEmail) {
		this.isbindEmail = isbindEmail;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getSecureLevel() {
		return secureLevel;
	}

	public void setSecureLevel(Integer secureLevel) {
		this.secureLevel = secureLevel;
	}

	public Integer getLoginErrornum() {
		return loginErrornum;
	}

	public void setLoginErrornum(Integer loginErrornum) {
		this.loginErrornum = loginErrornum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}
}
