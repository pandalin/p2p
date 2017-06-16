package com.jvv.p2p.biz.product;

import java.util.List;

import com.jvv.p2p.entity.DemandDto;
import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.entity.qry.TradeDtoQry;

/**
 *
 * trade数据库 表操作封装
 *
 * Created by cx on 2015/5/29.
 */
public interface TradeService {

	/**
	 * 根据ext id 更新
	 * 
	 * @param tradeDto
	 * @return
	 */
	int updateByExt(TradeDto tradeDto);

	/**
	 * 根据 ext_id 更新
	 * 
	 * @param demandDto
	 * @return
	 */
	int updateDemandByExt(DemandDto demandDto);

	/**
	 * 根据 extid获取对象
	 *
	 * @param extId
	 * @return
	 */
	TradeDto getByExtId(Integer extId);

	/**
	 * 数据库层查询
	 * 
	 * @param qry
	 * @return
	 */
	List<TradeDto> query(TradeDtoQry qry);

	/**
	 * 查询 广告位 p2p产品
	 * 
	 * @return
	 */
	TradeDto queryAd();

}
