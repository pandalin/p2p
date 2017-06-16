package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 * Created by cx on 2015/5/27.
 */
public class BindBankStep2Request {
    /*
    login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
    sessionid	客户端会话的唯一ID	String(36)	对web系统可以使用系统的Request.SessionID,对cs系统可以在每次系统运行时定义一个固定变量（推荐GUID）	要签	非空	ro2nkyppg3b0c2bjhk4lyk4l
    valid_code	短信验证码	valid_code	短信验证码	要签	非空

     */
    @Title("login_uid")
    private String loginUid;

    @Title("sessionid")
    private String sessionId;

    @Title("valid_code")
    private String validCode;

    public String getLoginUid() {
        return loginUid;
    }

    public void setLoginUid(String loginUid) {
        this.loginUid = loginUid;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }
}
