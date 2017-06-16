package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

public class FujianRequest {

	/*
	 *  login_uid	登陆用户ID	String(500)	由api系统产生的一段加密串，里面包含超时时间（默认30分钟）	要签	非空	j9kyVE3R3epD/LrbHi9+kZEredovSxJf
		type	类型	String(50)	原始担保函：olddbh
								原始担保合同：olddbht
								盖章担保函：newdbh
								盖章担保合同：newdbht
								投资名单：tzmd
								投资凭证：tzpz
								业务导出：ywdc	要签	非空	
		sourceid	目标ID	long (64)	当类型为业务导出时目标ID为登录用户ID（经济人才有此功能）
	
										当类型投资凭证时目标ID为投资详情ID（投资人才有此功能）
									
										其他业务类型目标ID都为交易ID	要签	非空	
	 */

	@Title("login_uid")
	private String loginUid;
	@Title("type")
	private String type;
	@Title("sourceid")
	private String sourceid;

	public String getLoginUid() {
		return loginUid;
	}

	public void setLoginUid(String loginUid) {
		this.loginUid = loginUid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceid() {
		return sourceid;
	}

	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

}
