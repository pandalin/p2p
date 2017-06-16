package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("tender_record")
public class TenderRecord {

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
	@Element("tradedetailinfotlist")
	private Tradedetailinfotlist tradedetailinfotlist;

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

	public Boolean getNocount() {
		return nocount;
	}

	public void setNocount(Boolean nocount) {
		this.nocount = nocount;
	}

	public Tradedetailinfotlist getTradedetailinfotlist() {
		return tradedetailinfotlist;
	}

	public void setTradedetailinfotlist(Tradedetailinfotlist tradedetailinfotlist) {
		this.tradedetailinfotlist = tradedetailinfotlist;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
