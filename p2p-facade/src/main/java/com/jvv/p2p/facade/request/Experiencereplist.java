package com.jvv.p2p.facade.request;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement("experiencereplist")
public class Experiencereplist {
	@Element("trade_expire_datep")
	private String tradeExpireDatep;
	@Element("loan_amount_str")
	private String loanAmountStr;
	@Element("trade_status_str")
	private String tradeStatusStr;
	@Element("amount")
	private String amount;
	@Element("loan_interest_str")
	private String loanInterestStr;
	@Element("invested_amount")
	private String investedAmount;
	@Element("interest")
	private String interest;
	transient private Result result;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public String getTradeExpireDatep() {
		return tradeExpireDatep;
	}
	public void setTradeExpireDatep(String tradeExpireDatep) {
		this.tradeExpireDatep = tradeExpireDatep;
	}
	public String getLoanAmountStr() {
		return loanAmountStr;
	}
	public void setLoanAmountStr(String loanAmountStr) {
		this.loanAmountStr = loanAmountStr;
	}
	public String getTradeStatusStr() {
		return tradeStatusStr;
	}
	public void setTradeStatusStr(String tradeStatusStr) {
		this.tradeStatusStr = tradeStatusStr;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getLoanInterestStr() {
		return loanInterestStr;
	}
	public void setLoanInterestStr(String loanInterestStr) {
		this.loanInterestStr = loanInterestStr;
	}
	public String getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(String investedAmount) {
		this.investedAmount = investedAmount;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
