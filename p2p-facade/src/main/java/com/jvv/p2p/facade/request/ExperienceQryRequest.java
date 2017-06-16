package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 * 体验标列表请求参数

page	页码	int	空，默认第一页。（1）	要签	可空	
pagesize	每页显示条数	int	空，默认每页显示5条	要签	可空	
trade_status	项目状态	int	空，默认全部详见【附录】交易状态（体验金）	要签	可空	
self_rate	利率	int	空，默认全部详见【附录】利率	要签	可空	

 * **/
public class ExperienceQryRequest {
	@Title("page")
	private Integer page;
	@Title("pagesize")
	private Integer pageSize;
	@Title("trade_status")
	private Integer tradeStatus;
	@Title("self_rate")
	private Integer selfRate;
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
	public Integer getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public Integer getSelfRate() {
		return selfRate;
	}
	public void setSelfRate(Integer selfRate) {
		this.selfRate = selfRate;
	}
	
}
