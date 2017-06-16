package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class Busseveninfot {

	/*
	BASE_DEAL_INFO	交易描述	string	交易描述	不签	可空
	DEBT_ENTERPRISE_INFO	原债务企业介绍	string	原债务企业介绍	不签	可空
	REPAY_SOURCE	还款来源	string	还款来源	不签	可空
	FACTONING_PROMISE_NO	担保承诺函	string	担保承诺函	不签	可空
	*/
	@Element("base_deal_info")
	private String baseDealInfo;
	
	@Element("DEBT_ENTERPRISE_INFO")
	private String debtEnterpriseInfo;
	
	@Element("REPAY_SOURCE")
	private String repaySource;
	
	@Element("FACTONING_PROMISE_NO")
	private String factoningPromiseNo;

	public String getBaseDealInfo() {
		return baseDealInfo;
	}

	public void setBaseDealInfo(String baseDealInfo) {
		this.baseDealInfo = baseDealInfo;
	}

	public String getDebtEnterpriseInfo() {
		return debtEnterpriseInfo;
	}

	public void setDebtEnterpriseInfo(String debtEnterpriseInfo) {
		this.debtEnterpriseInfo = debtEnterpriseInfo;
	}

	public String getRepaySource() {
		return repaySource;
	}

	public void setRepaySource(String repaySource) {
		this.repaySource = repaySource;
	}

	public String getFactoningPromiseNo() {
		return factoningPromiseNo;
	}

	public void setFactoningPromiseNo(String factoningPromiseNo) {
		this.factoningPromiseNo = factoningPromiseNo;
	}
	
	


}
