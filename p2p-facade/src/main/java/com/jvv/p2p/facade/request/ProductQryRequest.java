package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class ProductQryRequest {

	/*
	 *  guaranteecode	担保公司编码	String (20)	空，默认查询担保公司项目详见【附录】担保公司编码	要签	可空	两江担保如：“ljdb”
		biztype	项目类型	String (20)	空，默认查询全部详见【附录】项目类型	要签	可空	
		listcode	项目状态	String (20)	空，默认查询全部详见【附录】项目状态	要签	可空	
		Rate	利率	String (20)	空，默认全部详见【附录】利率	要签	可空	
		limit	期限	String (20)	空，默认全部详见【附录】期限	要签	可空	
		cachekey	缓存Key	String (50)	缓存Key	要签	可空	
		page	页码	Int(32)	页码,默认[0]	要签	可空	1
		pagesize	分页大小	Int(32)	范围[1-30],默认[1]	要签	可空	3
	 */
	@Title("guaranteecode")
	private String guaranteecode;
	@Title("biztype")
	private String biztype;
	@Title("listcode")
	private String listcode;
	@Title("rate")
	private String rate;
	@Title("limit")
	private String limit;
	@Title("cachekey")
	private String cachekey;
	@Title("isnonovice")
	private String isnonovice;
	@Title("page")
	private Integer page;
	@Title("pagesize")
	private Integer pagesize;
	
	public String getGuaranteecode() {
		return guaranteecode;
	}
	public void setGuaranteecode(String guaranteecode) {
		this.guaranteecode = guaranteecode;
	}
	public String getBiztype() {
		return biztype;
	}
	public void setBiztype(String biztype) {
		this.biztype = biztype;
	}
	public String getListcode() {
		return listcode;
	}
	public void setListcode(String listcode) {
		this.listcode = listcode;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getCachekey() {
		return cachekey;
	}
	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
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
	public String getIsnonovice() {
		return isnonovice;
	}
	public void setIsnonovice(String isnonovice) {
		this.isnonovice = isnonovice;
	}
}
