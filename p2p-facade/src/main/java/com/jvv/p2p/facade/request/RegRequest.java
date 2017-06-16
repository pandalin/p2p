package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 *  注册请求
 *
 * Created by cx on 2015/5/25.
 */
public class RegRequest  {

	@Title("phone")
    private String phone;//	手机号
	
	@Title("password")
    private String password;//	密码
	
	@Title("tjr")
    private String tjr;//	推荐人号
	
	@Title("yqr")
    private String yqr;//	邀请人
	
	@Title("code")
    private String code;    //短信验证码

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }

    public String getYqr() {
        return yqr;
    }

    public void setYqr(String yqr) {
        this.yqr = yqr;
    }
}
