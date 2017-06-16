package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

import java.math.BigDecimal;

/**
 * Created by linxm on 2016/8/8.新浪提现请求
 */
public class SinaPayWithDrawRequest {

    /*login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
    sessionid	sessionid	String	sessionid	要签	非空
    amount	提现金额	Number(32)	提现金额	要签	非空	100*/

    @Title("login_uid")
    private String loginUid;
    @Title("amount")
    private BigDecimal amount;
    @Title("sessionid")
    private String sessionId;

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
