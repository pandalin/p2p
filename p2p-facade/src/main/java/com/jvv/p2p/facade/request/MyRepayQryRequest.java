package com.jvv.p2p.facade.request;

import java.util.Date;

import com.jvv.p2p.facade.vo.Title;

public class MyRepayQryRequest {

	/*
	 *login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	s_pname	项目名称	String (50)	项目名称	要签	可空	
	s_hk_status	项目状态	String (20)	项目状态（0待回款，2已回款）	要签	可空	
	s_date_start	开始时间	String (20)	开始时间，格式yyyyMMddhhmmssfff	要签	可空	20140801120401233
	s_date_end	结束时间	String (20)	结束时间，格式yyyyMMddhhmmssfff	要签	可空	20140801120401233
	page	页码	Int(32)	页码,默认[0]	要签	可空	1
	pagesize	分页大小	Int(32)	范围[1-30],默认[1]	要签	可空	3
	trade_id	项目ID	Int(64)	trade_id，detail_id必须同时存在（查看单个投资的汇款计划）不同时存在默认查询全部	要签	可空	
	detail_id	投资详情ID	Int(64)	trade_id，detail_id必须同时存在（查看单个投资的汇款计划）不同时存在默认查询全部	要签	可空	 
	 */

	@Title("login_uid")
	private String loginUid;

	@Title("s_pname")
	private String sPname;

	@Title("s_hk_status")
	private String sHktatus;

	@Title("s_date_start")
	private Date sDateStart;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getsPname() {
		return sPname;
	}

	public void setsPname(String sPname) {
		this.sPname = sPname;
	}

	public String getsHktatus() {
		return sHktatus;
	}

	public void setsHktatus(String sHktatus) {
		this.sHktatus = sHktatus;
	}

	public Date getsDateStart() {
		return sDateStart;
	}

	public void setsDateStart(Date sDateStart) {
		this.sDateStart = sDateStart;
	}

}
