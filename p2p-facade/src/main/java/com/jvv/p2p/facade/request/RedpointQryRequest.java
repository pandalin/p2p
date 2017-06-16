package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class RedpointQryRequest {
	@Title("login_uid")
	private String loginUid;
	@Title("state")
	private String state;
	@Title("type")
	private String type;
	@Title("page")
	private Integer page;
	@Title("pagesize")
	private Integer pageSize;
	public String getLoginUid() {
		return loginUid;
	}
	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
}
