package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class ExperienceRecordRequest {
	@Title("trade_id")
	private String tradeId;
	@Title("pagesize")
	private Integer pageSize;
	@Title("page")
	private Integer page;
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
}
