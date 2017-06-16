package com.jvv.p2p.facade.request;

import java.math.BigDecimal;

import com.jvv.p2p.facade.vo.Title;

public class WithdrawRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	amount	提现金额	Number(32)	提现金额	要签	非空	
	code	短信验证码	String(10)	短信验证码	要签	非空	546745
	 */

	@Title("login_uid")
	private String loginUid;
	@Title("amount")
	private BigDecimal amount;
	@Title("code")
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
