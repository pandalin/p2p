package com.jvv.p2p.facade.response.account;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement("redpointinfo")
public class RedpointInfo {
	@Element("id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Element("title")
	private String title;
	@Element("contents")
	private String contents;
	@Element("overtime")
	private String overtime;
	@Element("redpointcost")
	private String redpointCost;
	@Element("redpointtype")
	private String redpointType;
	@Element("redpointsource")
	private String redpointSource;
	@Element("redpointusing")
	private String redpointUsing;
	@Element("islqredpoint")
	private Boolean isLqRedpoint;
	@Element("type")
	private Integer type;
	@Element("cost")
	private String cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getRedpointCost() {
		return redpointCost;
	}
	public void setRedpointCost(String redpointCost) {
		this.redpointCost = redpointCost;
	}
	public String getRedpointType() {
		return redpointType;
	}
	public void setRedpointType(String redpointType) {
		this.redpointType = redpointType;
	}
	public String getRedpointSource() {
		return redpointSource;
	}
	public void setRedpointSource(String redpointSource) {
		this.redpointSource = redpointSource;
	}
	public String getRedpointUsing() {
		return redpointUsing;
	}
	public void setRedpointUsing(String redpointUsing) {
		this.redpointUsing = redpointUsing;
	}
	public Boolean getIsLqRedpoint() {
		return isLqRedpoint;
	}
	public void setIsLqRedpoint(Boolean isLqRedpoint) {
		this.isLqRedpoint = isLqRedpoint;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
