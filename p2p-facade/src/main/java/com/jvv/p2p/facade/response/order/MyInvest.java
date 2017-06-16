package com.jvv.p2p.facade.response.order;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("myinvest")
public class MyInvest {

	@Element
	private Integer pageindex;
	@Element
	private Integer pagesize;
	@Element
	private Integer pagecount;
	@Element
	private Integer recordcount;

	@Element
	private Tradedetailviewinfotlist tradedetailviewinfotlist;

	transient private Result result;

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

	public Tradedetailviewinfotlist getTradedetailviewinfotlist() {
		return tradedetailviewinfotlist;
	}

	public void setTradedetailviewinfotlist(Tradedetailviewinfotlist tradedetailviewinfotlist) {
		this.tradedetailviewinfotlist = tradedetailviewinfotlist;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
