package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class EditpasswordRequest {

	/*
	 * login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
	old	原密码	String(100)	原密码	要签	可空	Ck_888
	pwd	新密码	String(100)	新密码	要签	非空	kyppg3b0c2bjh
	pwd_ok	确认新密	String(100)	新密码	要签	非空	ro2nkyppg3b
	type	类型	String(100)	类型（金窝窝传jww可以不输入原密码，其余原密码非空）	要签	可空	
	 */

	@Title("login_uid")
	private String loginUid;
	@Title("pwd")
	private String pwd;
	@Title("pwd_ok")
	private String pwdOk;
	@Title("type")
	private String type;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwdOk() {
		return pwdOk;
	}

	public void setPwdOk(String pwdOk) {
		this.pwdOk = pwdOk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
