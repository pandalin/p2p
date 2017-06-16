package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class ProductTradeQry {

	/*
	id	项目id	String (20)		要签	可空	
	page	页码	Int(32)	页码,默认[0]	要签	可空	1
	pagesize	分页大小	Int(32)	范围[1-30],默认[1]	要签	可空	3
	*/

	@Title("id")
	private String id;
	@Title("page")
	private Integer page;
	@Title("pagesize")
	private Integer pagesize;
	@Title("login_uid")
	private String loginUid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}
}
