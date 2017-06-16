package com.jvv.p2p.entity.qry;

import java.math.BigDecimal;

import com.jvv.p2p.entity.TradeDto;

public class TradeDtoQry extends TradeDto {

	private String guaranteecode;//担保公司编码

	private String listcode;//项目状态

	private String orderBy;

	private BigDecimal perlenBegin;

	private BigDecimal perlenEnd;

	/*
	 *  guaranteecode	担保公司编码	String (20)	空，默认查询担保公司项目详见【附录】担保公司编码	要签	可空	两江担保如：“ljdb”
		biztype	项目类型	String (20)	空，默认查询全部详见【附录】项目类型	要签	可空	
		listcode	项目状态	String (20)	空，默认查询全部详见【附录】项目状态	要签	可空	
	 */

	public String getGuaranteecode() {
		return guaranteecode;
	}

	public void setGuaranteecode(String guaranteecode) {
		this.guaranteecode = guaranteecode;
	}

	public String getListcode() {
		return listcode;
	}

	public void setListcode(String listcode) {
		this.listcode = listcode;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public BigDecimal getPerlenBegin() {
		return perlenBegin;
	}

	public void setPerlenBegin(BigDecimal perlenBegin) {
		this.perlenBegin = perlenBegin;
	}

	public BigDecimal getPerlenEnd() {
		return perlenEnd;
	}

	public void setPerlenEnd(BigDecimal perlenEnd) {
		this.perlenEnd = perlenEnd;
	}

}
