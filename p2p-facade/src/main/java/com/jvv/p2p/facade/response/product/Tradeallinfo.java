package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("tradeallinfo")
public class Tradeallinfo {

	@Element
	private Tradeinfo tradeinfo;
	@Element
	private Demandinfo demandinfo;
	@Element
	private Busguaranteeinfo busguaranteeinfo;
	@Element
	private Busseveninfo busseveninfo;
	
	
	@Element
	private Dborhgprofilelist dborhgprofilelist;

	@Element("risk_guarantee")
	private String riskGuarantee;

	transient private Result result;

	public Demandinfo getDemandinfo() {
		return demandinfo;
	}

	public void setDemandinfo(Demandinfo demandinfo) {
		this.demandinfo = demandinfo;
	}

	public Tradeinfo getTradeinfo() {
		return tradeinfo;
	}

	public void setTradeinfo(Tradeinfo tradeinfo) {
		this.tradeinfo = tradeinfo;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getRiskGuarantee() {
		return riskGuarantee;
	}

	public void setRiskGuarantee(String riskGuarantee) {
		this.riskGuarantee = riskGuarantee;
	}

	public Busguaranteeinfo getBusguaranteeinfo() {
		return busguaranteeinfo;
	}

	public void setBusguaranteeinfo(Busguaranteeinfo busguaranteeinfo) {
		this.busguaranteeinfo = busguaranteeinfo;
	}

	public Dborhgprofilelist getDborhgprofilelist() {
		return dborhgprofilelist;
	}

	public void setDborhgprofilelist(Dborhgprofilelist dborhgprofilelist) {
		this.dborhgprofilelist = dborhgprofilelist;
	}

	public Busseveninfo getBusseveninfo() {
		return busseveninfo;
	}

	public void setBusseveninfo(Busseveninfo busseveninfo) {
		this.busseveninfo = busseveninfo;
	}
}
