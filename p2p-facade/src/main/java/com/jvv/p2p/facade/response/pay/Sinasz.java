package com.jvv.p2p.facade.response.pay;

import java.util.Date;

import org.xmappr.Element;

public class Sinasz {

	@Element(name = "strszrzsj", format = "yyyy-MM-dd HH:mm:ss")
	private Date strszrzsj;
	
	@Element(name = "strszfse")
	private String strszfse;
	
	@Element(name = "strszjyhye")
	private String strszjyhye;
	
	@Element(name = "strszzy")
	private String strszzy;

	public Date getStrszrzsj() {
		return strszrzsj;
	}

	public void setStrszrzsj(Date strszrzsj) {
		this.strszrzsj = strszrzsj;
	}

	public String getStrszfse() {
		return strszfse;
	}

	public void setStrszfse(String strszfse) {
		this.strszfse = strszfse;
	}

	public String getStrszjyhye() {
		return strszjyhye;
	}

	public void setStrszjyhye(String strszjyhye) {
		this.strszjyhye = strszjyhye;
	}

	public String getStrszzy() {
		return strszzy;
	}

	public void setStrszzy(String strszzy) {
		this.strszzy = strszzy;
	}

}
