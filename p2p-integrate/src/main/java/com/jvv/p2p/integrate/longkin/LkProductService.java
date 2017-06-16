package com.jvv.p2p.integrate.longkin;

import java.io.IOException;

import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.request.ProductTradeQry;
import com.jvv.p2p.facade.response.product.Replist;
import com.jvv.p2p.facade.response.product.TenderRecord;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;

public interface LkProductService {

	/**
	 * 查询 投资项目列表
	 */
	TradeInvest query(ProductQryRequest qry) throws IOException;

	/**
	 * 查询项目详情
	 * 
	 * @param productId
	 */
	Tradeallinfo get(String productId) throws IOException;

	/**
	 * 查询 产品投资 情况
	 * 
	 * @param qry
	 * @throws IOException
	 */
	TenderRecord getTradeRecord(ProductTradeQry qry) throws IOException;

	/**
	 * 查询产品的 回款计划
	 * 
	 * @throws IOException
	 */
	Replist getTradeReplist(String tradeId) throws IOException;

}
