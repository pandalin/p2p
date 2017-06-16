package com.jvv.p2p.facade.response.pay;

import java.util.Date;

import org.xmappr.Element;

public class Sinajy {

	/*
	 *   <strjyddh>T12015060215450684424334</strjyddh>
	        <strjyzy>投资支付</strjyzy>
	        <strjyje>100.00</strjyje>
	        <strjyzt>交易结束</strjyzt>
	        <strjycjsj>2015-06-02 15:45:06</strjycjsj>
	        <strjyxgsj>2015-06-02 15:45:09</strjyxgsj>
	 */
	@Element("strjyddh")
	private String strjyddh;
	@Element("strjyzy")
	private String strjyzy;
	@Element("strjyje")
	private String strjyje;
	@Element("strjyzt")
	private String strjyzt;
	@Element(name = "strjycjsj", format = "yyyy-MM-dd HH:mm:ss")
	private Date strjycjsj;
	@Element(name = "strjyxgsj", format = "yyyy-MM-dd HH:mm:ss")
	private Date strjyxgsj;

	public String getStrjyddh() {
		return strjyddh;
	}

	public void setStrjyddh(String strjyddh) {
		this.strjyddh = strjyddh;
	}

	public String getStrjyzy() {
		return strjyzy;
	}

	public void setStrjyzy(String strjyzy) {
		this.strjyzy = strjyzy;
	}

	public String getStrjyje() {
		return strjyje;
	}

	public void setStrjyje(String strjyje) {
		this.strjyje = strjyje;
	}

	public String getStrjyzt() {
		return strjyzt;
	}

	public void setStrjyzt(String strjyzt) {
		this.strjyzt = strjyzt;
	}

	public Date getStrjycjsj() {
		return strjycjsj;
	}

	public void setStrjycjsj(Date strjycjsj) {
		this.strjycjsj = strjycjsj;
	}

	public Date getStrjyxgsj() {
		return strjyxgsj;
	}

	public void setStrjyxgsj(Date strjyxgsj) {
		this.strjyxgsj = strjyxgsj;
	}

}
