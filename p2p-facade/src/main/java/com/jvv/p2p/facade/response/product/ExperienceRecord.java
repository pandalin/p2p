package com.jvv.p2p.facade.response.product;

import java.util.List;

import org.xmappr.Element;
import org.xmappr.Namespaces;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("experience_tzpage")
public class ExperienceRecord {
	@Element("pageindex")
	private Integer pageIndex;
	@Element("pagecount")
	private Integer pageCount;
	@Element("recordcount")
	private Integer recordCount;
	@Element("nocount")
	private Boolean nocount;
	@Element(name="experience_tzlist" , targetType=ExperienceTzList.class)
	private ExperienceTzList experienceTzList;
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
	public ExperienceTzList getExperienceTzList() {
		return experienceTzList;
	}
	public void setExperienceTzList(ExperienceTzList experienceTzList) {
		this.experienceTzList = experienceTzList;
	}
	
	
}
