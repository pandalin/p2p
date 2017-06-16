package com.jvv.p2p.facade.response.order;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("repay")
public class MyRepay {
	@Element
	private Integer pageindex;
	@Element
	private Integer pagesize;
	@Element
	private Integer pagecount;
	@Element
	private Integer recordcount;

	@Element
	private Divisioninfotlist divisioninfotlist;

	transient private Result result;

	public Divisioninfotlist getDivisioninfotlist() {
		return divisioninfotlist;
	}

	public void setDivisioninfotlist(Divisioninfotlist divisioninfotlist) {
		this.divisioninfotlist = divisioninfotlist;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
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
}
