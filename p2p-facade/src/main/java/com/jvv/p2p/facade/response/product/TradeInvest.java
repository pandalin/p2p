package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("trade_invest")
public class TradeInvest {

	@Element
	private Tradeviewinfotlist tradeviewinfotlist;
	@Element
	private Integer pageindex;
	@Element
	private Integer pagesize;
	@Element
	private Integer pagecount;
	@Element
	private Integer recordcount;
	@Element
	private Boolean nocount;

	private BigDecimal pvrate = BigDecimal.valueOf(0.015);//利率

	transient private Result result;

	public Tradeviewinfotlist getTradeviewinfotlist() {
		return tradeviewinfotlist;
	}

	public void setTradeviewinfotlist(Tradeviewinfotlist tradeviewinfotlist) {
		this.tradeviewinfotlist = tradeviewinfotlist;
	}

	public Integer getPageindex() {
		return pageindex;
	}

	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public Integer getPagecount() {
		return pagecount;
	}

	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}

	public Integer getRecordcount() {
		return recordcount;
	}

	public void setRecordcount(Integer recordcount) {
		this.recordcount = recordcount;
	}

	public Boolean getNocount() {
		return nocount;
	}

	public void setNocount(Boolean nocount) {
		this.nocount = nocount;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public BigDecimal getPvrate() {
		return pvrate;
	}

	public void setPvrate(BigDecimal pvrate) {
		this.pvrate = pvrate;
	}

}
