package com.jvv.p2p.biz.product;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.jvv.p2p.dao.DemandDtoMapper;
import com.jvv.p2p.dao.TradeDtoMapper;
import com.jvv.p2p.entity.DemandDto;
import com.jvv.p2p.entity.DemandDtoExample;
import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.entity.TradeDtoExample;
import com.jvv.p2p.entity.qry.TradeDtoQry;
import com.jvv.p2p.facade.em.Biztype;

/**
 * Created by cx on 2015/5/29.
 */
@Named
public class TradeServiceImpl implements TradeService {

	@Inject
	private TradeDtoMapper tradeDtoMapper;

	@Inject
	private DemandDtoMapper demandDtoMapper;

	@Override
	public List<TradeDto> query(TradeDtoQry qry) {
		TradeDtoExample ex = new TradeDtoExample();

		if (qry != null) {
			TradeDtoExample.Criteria or = ex.or();
			if (StringUtils.isNotEmpty(qry.getGuaranteecode())) {
				//TODO 
			}
			if (StringUtils.isNotEmpty(qry.getBizType())) {//是否新手标
				or.andBizTypeEqualTo(qry.getBizType());
			}
			if (StringUtils.isNotEmpty(qry.getListcode())) {
				//or.andStatusEqualTo(qry.getListcode());

			}
			if (StringUtils.isNotEmpty(qry.getIsinvest())) {
				or.andIsinvestEqualTo(qry.getIsinvest());
			}

			if (StringUtils.isNotEmpty(qry.getOrderBy())) {//排序
				ex.setOrderByClause(qry.getOrderBy());

			}

		}

		return tradeDtoMapper.selectByExample(ex);
	}

	@Override
	public int updateByExt(TradeDto tradeDto) {
		checkNotNull(tradeDto);
		checkNotNull(tradeDto.getExtId());

		TradeDto dto = getByExtId(tradeDto.getExtId());//查询数据库 中是否有记录

		tradeDto.setUpdateTime(new Date());//修改
		int n = 0;
		if (dto == null) {//新增
			tradeDto.setId(UUID.randomUUID().toString());
			tradeDto.setCreateTime(tradeDto.getUpdateTime());

			n = tradeDtoMapper.insert(tradeDto);

		} else {//修改
			tradeDto.setCreateTime(dto.getCreateTime());
			tradeDto.setId(dto.getId());

			n = tradeDtoMapper.updateByPrimaryKey(tradeDto);
		}

		return n;
	}

	@Override
	public int updateDemandByExt(DemandDto demandDto) {
		checkNotNull(demandDto);
		checkNotNull(demandDto.getExtId());

		DemandDto dto = getDemandByExtId(demandDto.getExtId());//查询数据库 中是否有记录

		demandDto.setUpdateTime(new Date());//修改

		int n = 0;
		if (dto == null) {//新增
			demandDto.setId(UUID.randomUUID().toString());
			demandDto.setCreateTime(demandDto.getUpdateTime());

			n = demandDtoMapper.insert(demandDto);

		} else {//修改
			demandDto.setCreateTime(dto.getCreateTime());
			demandDto.setId(dto.getId());

			n = demandDtoMapper.updateByPrimaryKey(demandDto);
		}

		return n;
	}

	public DemandDto getDemandByExtId(Integer extId) {

		DemandDtoExample ex = new DemandDtoExample();
		ex.or().andExtIdEqualTo(extId);

		List<DemandDto> dtos = demandDtoMapper.selectByExample(ex);

		if (CollectionUtils.isEmpty(dtos)) {
			return null;
		}

		return dtos.get(0);
	}

	@Override
	public TradeDto getByExtId(Integer extId) {

		TradeDtoExample ex = new TradeDtoExample();
		ex.or().andExtIdEqualTo(extId);

		List<TradeDto> dtos = tradeDtoMapper.selectByExample(ex);

		if (CollectionUtils.isEmpty(dtos)) {
			return null;
		}

		return dtos.get(0);
	}

	@Override
	public TradeDto queryAd() {
		TradeDtoQry qry = new TradeDtoQry();
		qry.setBizType(Biztype.NOVICE.name());

		qry.setOrderBy(" invest_start_date desc ");
		List<TradeDto> list = query(qry);
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}

		return list.get(0);
	}

}
