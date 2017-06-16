package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

import java.math.BigDecimal;

/**
 * Created by cx on 2015/5/27.
 */
public class InvestRequest  {
    /*
    login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
    tradeid	项目号	Int(64)	项目号	要签	非空	546745
    code	短信验证码	String(10)	短信验证码	要签	非空	546745
    investamount	投资额	Number(32)	确认投资额	要签	非空
    overinvestamount	确认投资额	Number(32)	确认投资额	要签	非空
     */
    @Title("login_uid")
    private String loginUid;

    @Title("tradeid")
    private String tradeid;

    @Title("code")
    private String code;

    @Title("investamount")
    private BigDecimal investamount;

    @Title("overinvestamount")
    private BigDecimal overinvestamount;

    public String getLoginUid() {
        return loginUid;
    }

    public void setLoginUid(String loginUid) {
        this.loginUid = loginUid;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getInvestamount() {
        return investamount;
    }

    public void setInvestamount(BigDecimal investamount) {
        this.investamount = investamount;
    }

    public BigDecimal getOverinvestamount() {
        return overinvestamount;
    }

    public void setOverinvestamount(BigDecimal overinvestamount) {
        this.overinvestamount = overinvestamount;
    }


}
