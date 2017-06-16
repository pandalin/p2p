package com.jvv.p2p.biz.product;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;

import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.entity.qry.TradeDtoQry;
import com.jvv.p2p.facade.ProductService;
import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.request.ProductTradeQry;
import com.jvv.p2p.facade.response.product.Replist;
import com.jvv.p2p.facade.response.product.TenderRecord;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;
import com.jvv.p2p.integrate.longkin.LkProductService;

/**
 * Created by cx on 2015/5/26.
 */
@Named("productService")
@WebService(targetNamespace = "p2p")
public class ProductServiceImpl implements ProductService {

	@Inject
	private LkProductService lkProductService;

	@Inject
	private TradeService tradeService;

	@Override
	public TradeInvest query(ProductQryRequest qry) throws IOException {
		TradeInvest tis = lkProductService.query(qry);
		

		return tis;
	}

	@Override
	public Tradeallinfo get(String id) throws IOException {
		return lkProductService.get(id);
	}

	@Override
	public TenderRecord getTradeRecord(ProductTradeQry qry) throws IOException {
		return lkProductService.getTradeRecord(qry);
	}

	@Override
	public Replist getTradeReplist(String tradeId) throws IOException {
		return lkProductService.getTradeReplist(tradeId);
	}

	@Override
	public Tradeallinfo queryAd() throws IOException {
		TradeDto dto = tradeService.queryAd();

		if (dto == null) {
			return null;
		}
		if (dto.getExtId() == null) {
			return null;
		}

		return this.get(dto.getExtId() + "");

	}

	/**
	 * 查询数据库
	 * 
	 * @param qry
	 * @return
	 */
	public List<TradeDto> queryDb(TradeDtoQry qry) {
		return tradeService.query(qry);

	}

}
