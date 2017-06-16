package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class MyInvestQryRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	type	类型	String(10)	参见(我的投资类型)默认-1	要签	非空	-1
	page	页码	Int(32)	页码, 默认[0]	要签	可空	1
	pagesize	分页大小	Int(32)	范围[1-30], 默认[1]	要签	可空	3
	 */

	@Title("login_uid")
	private String loginUid;

	@Title("type")
	private String type;

	@Title("page")
	private Integer page;

	@Title("pagesize")
	private Integer pagesize;
	
	@Title("tradetype")           // 参考附录项目类型(直投、转让、体验） 默认直投
	private String tradeType;
	
	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
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

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

}
