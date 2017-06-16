package com.jvv.p2p.biz.product.collect;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

import com.jvv.p2p.biz.product.DemandDtoConvert;
import com.jvv.p2p.biz.product.TradeDtoConvert;
import com.jvv.p2p.biz.product.TradeService;
import com.jvv.p2p.entity.DemandDto;
import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.facade.request.ProductQryRequest;
import com.jvv.p2p.facade.response.product.Demandinfot;
import com.jvv.p2p.facade.response.product.Trade;
import com.jvv.p2p.facade.response.product.TradeInvest;
import com.jvv.p2p.facade.response.product.Tradeallinfo;
import com.jvv.p2p.facade.response.product.Tradeviewinfo;
import com.jvv.p2p.integrate.longkin.LkProductService;

/**
 * Created by cx on 2015/5/29.
 */
@Named
public class ProductCollectImpl implements ProductCollect {

	@Inject
	private LkProductService lkProductService;

	@Inject
	private TradeDtoConvert tradeDtoConvert;
	@Inject
	private DemandDtoConvert demandDtoConvert;

	@Inject
	private TradeService tradeService;

	private final static int DEFAULT_PAGE_SIZE = 30;

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	@Transactional
	public void collect() throws IOException {
		// 全量列表查询
		int p = 1;
		signCollect(p);

	}

	private void signCollect(int page) throws IOException {
		ProductQryRequest qry = new ProductQryRequest();
		qry.setPagesize(DEFAULT_PAGE_SIZE);
		qry.setPage(page);

		// 根据返回值 翻页查询
		TradeInvest tradeInvest = lkProductService.query(qry);
		
		if (!tradeInvest.getResult().isSuc()) {
			log.warn("更新远程数据失败!");
			return;
		}

		// 循环 单个产品查询
		for (Tradeviewinfo viewinfo : tradeInvest.getTradeviewinfotlist().getTradeviewinfos().getTradeviewinfo()) {
			Tradeallinfo tradeallinfo = lkProductService.get(viewinfo.getId() + "");
			if (!tradeallinfo.getResult().isSuc()) {
				log.info("获取产品信息错误:" + tradeallinfo.getResult().getResponseMsg());
				continue;
			}

			//更新 本地数据库 trade 表
			{
				Trade trade = tradeallinfo.getTradeinfo().getTrade();
				TradeDto dto = tradeDtoConvert.convert(trade);

				tradeService.updateByExt(dto);
			}
			// 更新 担保信息
			{
				Demandinfot demand = tradeallinfo.getDemandinfo().getDemandinfot();
				DemandDto dto = demandDtoConvert.convert(demand);

				tradeService.updateDemandByExt(dto);
			}

			//TODO 更新需求信息

		}
		checkNotNull(tradeInvest.getPagecount());
		checkNotNull(tradeInvest.getPageindex());

		if (tradeInvest.getPageindex() < tradeInvest.getPagecount()) {
			signCollect(tradeInvest.getPageindex() + 1);
		}

	}
}
