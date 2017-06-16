package com.jvv.p2p.facade.response.product;

import org.xmappr.Element;

public class Busguaranteeinfot {

	@Element
	private Integer id;

	@Element("demand_id")
	private Integer demandId;

	@Element("guarantee_id")
	private Integer guaranteeId;

	@Element("loan_note")
	private String loanNote;

	@Element("loan_purpose")
	private String loanPurpose;

	@Element("repay_source")
	private String repaySource;
	@Element("enterprise_info")
	private String enterpriseInfo;
	@Element("risk_guarantee")
	private String riskGuarantee;
	@Element("guarantee_statement")
	private String guaranteeStatement;
	@Element("guarantee_licence_no")
	private String guaranteeLicenceNo;

	@Element("guarantee_promise_no")
	private String guaranteePromiseNo;
	@Element("contract_no")
	private String contractNo;
	@Element("loan_flow_no")
	private String loanFlowNo;
	@Element("contract_tmp_code")
	private String contractTmpCode;
	@Element("dept_jgjm")
	private String deptJgjm;

	@Element("dept_name")
	private String deptName;
	@Element("dept_short_name")
	private String deptShortName;
	@Element("dept_organprop_code")
	private String deptOrganpropCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDemandId() {
		return demandId;
	}

	public void setDemandId(Integer demandId) {
		this.demandId = demandId;
	}

	public Integer getGuaranteeId() {
		return guaranteeId;
	}

	public void setGuaranteeId(Integer guaranteeId) {
		this.guaranteeId = guaranteeId;
	}

	public String getLoanNote() {
		return loanNote;
	}

	public void setLoanNote(String loanNote) {
		this.loanNote = loanNote;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getRepaySource() {
		return repaySource;
	}

	public void setRepaySource(String repaySource) {
		this.repaySource = repaySource;
	}

	public String getEnterpriseInfo() {
		return enterpriseInfo;
	}

	public void setEnterpriseInfo(String enterpriseInfo) {
		this.enterpriseInfo = enterpriseInfo;
	}

	public String getRiskGuarantee() {
		return riskGuarantee;
	}

	public void setRiskGuarantee(String riskGuarantee) {
		this.riskGuarantee = riskGuarantee;
	}

	public String getGuaranteeStatement() {
		return guaranteeStatement;
	}

	public void setGuaranteeStatement(String guaranteeStatement) {
		this.guaranteeStatement = guaranteeStatement;
	}

	public String getGuaranteeLicenceNo() {
		return guaranteeLicenceNo;
	}

	public void setGuaranteeLicenceNo(String guaranteeLicenceNo) {
		this.guaranteeLicenceNo = guaranteeLicenceNo;
	}

	public String getGuaranteePromiseNo() {
		return guaranteePromiseNo;
	}

	public void setGuaranteePromiseNo(String guaranteePromiseNo) {
		this.guaranteePromiseNo = guaranteePromiseNo;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getLoanFlowNo() {
		return loanFlowNo;
	}

	public void setLoanFlowNo(String loanFlowNo) {
		this.loanFlowNo = loanFlowNo;
	}

	public String getContractTmpCode() {
		return contractTmpCode;
	}

	public void setContractTmpCode(String contractTmpCode) {
		this.contractTmpCode = contractTmpCode;
	}

	public String getDeptJgjm() {
		return deptJgjm;
	}

	public void setDeptJgjm(String deptJgjm) {
		this.deptJgjm = deptJgjm;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptShortName() {
		return deptShortName;
	}

	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName;
	}

	public String getDeptOrganpropCode() {
		return deptOrganpropCode;
	}

	public void setDeptOrganpropCode(String deptOrganpropCode) {
		this.deptOrganpropCode = deptOrganpropCode;
	}

}
