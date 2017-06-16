package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class ChargeQryRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	serchtype 	交易查询类型	String(10)	见（交易查询类型）	要签	非空	
	serchtime	交易查询时间类型	String(10)	见（交易查询时间类型）	要签	非空	
	zhtype	账户类型	String(10)	见（账户类型类型）收支明细包含（基本户，存钱罐）存钱罐两种都能查，基本户不能查存钱罐，默认查询基本户	要签	可空	
	page	页码	Int(32)	页码[1-max], 默认[1]	要签	可空	1
	pagesize	分页大小	Int(32)	范围[1-30], 默认[1]	要签	可空	3
	 */

	@Title("login_uid")
	private String loginUid;
	@Title("serchtype")
	private String serchtype;
	@Title("serchtime")
	private String serchtime;
	@Title("zhtype")
	private String zhtype;
	@Title("page")
	private Integer page;
	@Title("pagesize")
	private Integer pagesize;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getSerchtype() {
		return serchtype;
	}

	public void setSerchtype(String serchtype) {
		this.serchtype = serchtype;
	}

	public String getSerchtime() {
		return serchtime;
	}

	public void setSerchtime(String serchtime) {
		this.serchtime = serchtime;
	}

	public String getZhtype() {
		return zhtype;
	}

	public void setZhtype(String zhtype) {
		this.zhtype = zhtype;
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

}
