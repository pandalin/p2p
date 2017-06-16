package com.jvv.p2p.facade.response.account;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("redpoint")
public class RedPoint {
	@Element("pageindex")
	private Integer pageIndex;
	@Element("pagesize")
	private Integer pageSize;
	@Element("pagecount")
	private Integer pageCount;
	@Element("recordcount")
	private Integer recordCount;
	@Element("nocount")
	private Boolean nocount;
	@Element(name = "redpointlist")
	private RedpointList redpointList;
	transient private Result result;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	public Boolean getNocount() {
		return nocount;
	}
	public void setNocount(Boolean nocount) {
		this.nocount = nocount;
	}
	public RedpointList getRedpointList() {
		return redpointList;
	}
	public void setRedpointList(RedpointList redpointList) {
		this.redpointList = redpointList;
	}
	
	
}
