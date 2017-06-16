package com.jvv.p2p.facade;

import java.io.IOException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.request.ProductTradeQry;
import com.jvv.p2p.facade.response.product.Replist;
import com.jvv.p2p.facade.response.product.TenderRecord;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;

/**
 * Created by cx on 2015/5/20.
 * 
 */
@WebService(targetNamespace = "p2p")
public interface ProductService {

	/**
	 * 查询 投资项目列表
	 */
	@WebMethod
	TradeInvest query(ProductQryRequest qry) throws IOException;

	/**
	 * 查询 广告位 p2p产品
	 * 
	 * @return
	 */
	@WebMethod
	Tradeallinfo queryAd() throws IOException;
	
	
	/**
	 * 查询项目详情
	 * 
	 * @param productId
	 */
	@WebMethod
	Tradeallinfo get(String productId) throws IOException;

	/**
	 * 查询 产品投资 情况
	 * 
	 * @param qry
	 * @throws IOException
	 */
	@WebMethod
	TenderRecord getTradeRecord(ProductTradeQry qry) throws IOException;

	/**
	 * 查询产品的 回款计划
	 * 
	 * @throws IOException
	 */
	Replist getTradeReplist(String tradeId) throws IOException;

}
