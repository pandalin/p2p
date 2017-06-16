package com.jvv.p2p.facade.response.product;

import java.math.BigDecimal;

import org.xmappr.Element;
import org.xmappr.RootElement;


@RootElement(name="experiencetz")
public class ExperienceDetailInfoT {
	@Element("investor_username")
	private String investorUsername;
	@Element("create_time")
	private String createTime;
	@Element("invest_amount")
	private BigDecimal investAmount;
	@Element("str_invest_amount")
	private String strInvestAmount;
	@Element("strtzzt")
	private String strtzzt;
	public String getInvestorUsername() {
		return investorUsername;
	}
	public void setInvestorUsername(String investorUsername) {
		this.investorUsername = investorUsername;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public BigDecimal getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(BigDecimal investAmount) {
		this.investAmount = investAmount;
	}
	public String getStrInvestAmount() {
		return strInvestAmount;
	}
	public void setStrInvestAmount(String strInvestAmount) {
		this.strInvestAmount = strInvestAmount;
	}
	public String getStrtzzt() {
		return strtzzt;
	}
	public void setStrtzzt(String strtzzt) {
		this.strtzzt = strtzzt;
	}
	
}
