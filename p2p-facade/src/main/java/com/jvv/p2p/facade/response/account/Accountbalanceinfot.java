package com.jvv.p2p.facade.response.account;

import java.math.BigDecimal;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement
public class Accountbalanceinfot {

	@Element
	private Integer id;
	@Element("user_id")
	private Integer userId;
	@Element
	private BigDecimal balance;
	@Element("available_balance")
	private BigDecimal availableBalance;
	@Element("freeze_balance")
	private BigDecimal freezeBalance;
	@Element("yesterday_profit")
	private BigDecimal yesterdayProfit;
	@Element("week_profit")
	private BigDecimal weekProfit;
	@Element("month_profit")
	private BigDecimal monthProfit;
	@Element("all_profit")
	private BigDecimal allProfit;
	
	@Element("experience_amount")
	private BigDecimal experienceAmount;
	public BigDecimal getExperienceAmount() {
		return experienceAmount;
	}

	public void setExperienceAmount(BigDecimal experienceAmount) {
		this.experienceAmount = experienceAmount;
	}

	transient private Result result;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public BigDecimal getFreezeBalance() {
		return freezeBalance;
	}

	public void setFreezeBalance(BigDecimal freezeBalance) {
		this.freezeBalance = freezeBalance;
	}

	public BigDecimal getYesterdayProfit() {
		return yesterdayProfit;
	}

	public void setYesterdayProfit(BigDecimal yesterdayProfit) {
		this.yesterdayProfit = yesterdayProfit;
	}

	public BigDecimal getWeekProfit() {
		return weekProfit;
	}

	public void setWeekProfit(BigDecimal weekProfit) {
		this.weekProfit = weekProfit;
	}

	public BigDecimal getMonthProfit() {
		return monthProfit;
	}

	public void setMonthProfit(BigDecimal monthProfit) {
		this.monthProfit = monthProfit;
	}

	public BigDecimal getAllProfit() {
		return allProfit;
	}

	public void setAllProfit(BigDecimal allProfit) {
		this.allProfit = allProfit;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
