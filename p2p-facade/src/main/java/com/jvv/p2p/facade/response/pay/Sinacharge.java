package com.jvv.p2p.facade.response.pay;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("sinacharge")
public class Sinacharge {

	@Element("sinajy")
	private Sinajyt sinajy;

	@Element("sinasz")
	private Sinaszt sinasz;

	@Element("total_income")
	private String totalIncome;

	@Element("total_payout")
	private String totalPayout;

	@Element
	private Integer pageindex;
	@Element
	private Integer pagesize;
	@Element
	private Integer recordcount;

	transient private Result result;

	public Sinajyt getSinajy() {
		return sinajy;
	}

	public void setSinajy(Sinajyt sinajy) {
		this.sinajy = sinajy;
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

	public Integer getRecordcount() {
		return recordcount;
	}

	public void setRecordcount(Integer recordcount) {
		this.recordcount = recordcount;
	}

	public Sinaszt getSinasz() {
		return sinasz;
	}

	public void setSinasz(Sinaszt sinasz) {
		this.sinasz = sinasz;
	}

	public String getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}

	public String getTotalPayout() {
		return totalPayout;
	}

	public void setTotalPayout(String totalPayout) {
		this.totalPayout = totalPayout;
	}

}
