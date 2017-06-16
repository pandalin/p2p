package com.jvv.p2p.facade.request;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jvv.p2p.facade.vo.Title;

public class RechargeStep1Request implements Serializable{

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	   amount	充值金额	Number(32)	充值金额	要签	非空	
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1316370194116922467L;

	@Title("login_uid")
	private String loginUid;

	@Title("amount")
	private BigDecimal amount;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
