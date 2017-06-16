package com.jvv.p2p.facade.request;

import java.math.BigDecimal;

import com.jvv.p2p.facade.vo.Title;

/**
 * 体验标投资请求
 * **/
public class ExperienceInvestRequest {
	@Title("login_uid")
	private String loginUid;
	@Title("trade_id")
	private String tradeId;
	@Title("invest_amount")
	private BigDecimal investAmount;
	@Title("overinvestamount")
	private BigDecimal overinvestAmount;
	@Title("code")
	private String code;
	public String getLoginUid() {
		return loginUid;
	}
	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public BigDecimal getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(BigDecimal investAmount) {
		this.investAmount = investAmount;
	}
	public BigDecimal getOverinvestAmount() {
		return overinvestAmount;
	}
	public void setOverinvestAmount(BigDecimal overinvestAmount) {
		this.overinvestAmount = overinvestAmount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
