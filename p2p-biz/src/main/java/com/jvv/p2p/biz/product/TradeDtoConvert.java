package com.jvv.p2p.biz.product;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.facade.response.product.Trade;

/**
 * Created by cx on 2015/5/29.
 */
@Named
public class TradeDtoConvert {

	public TradeDto convert(Trade orig) {
		TradeDto dest = new TradeDto();
		BeanUtils.copyProperties(orig, dest, "id", "createtime");

		//设置id
		dest.setExtId(orig.getId());

		//createtime
		dest.setExtCreateTime(orig.getCreateTime());
		
		
		dest.setInterestRate(orig.getInterestRate());

		//invest
		dest.setIsinvest(orig.getInvest() + "");
		
		return dest;
	}

	public Trade convert(TradeDto orig) {
		Trade dest = new Trade();
		BeanUtils.copyProperties(orig, dest);
		//设置id
		dest.setId(orig.getExtId());

		//cratetime
		dest.setCreateTime(orig.getExtCreateTime());

		return dest;
	}

	public List<Trade> convertDtoToV(List<TradeDto> origs) {
		List<Trade> dests = new ArrayList<Trade>();
		if (CollectionUtils.isEmpty(origs))
			return dests;
		for (TradeDto orig : origs) {
			Trade dest = this.convert(orig);
			dests.add(dest);
		}

		return dests;
	}

}
