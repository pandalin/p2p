package com.jvv.p2p.dao;

import com.jvv.p2p.entity.TradeDto;
import com.jvv.p2p.entity.TradeDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeDtoMapper {
    int countByExample(TradeDtoExample example);

    int deleteByExample(TradeDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TradeDto record);

    int insertSelective(TradeDto record);

    List<TradeDto> selectByExample(TradeDtoExample example);

    TradeDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TradeDto record, @Param("example") TradeDtoExample example);

    int updateByExample(@Param("record") TradeDto record, @Param("example") TradeDtoExample example);

    int updateByPrimaryKeySelective(TradeDto record);

    int updateByPrimaryKey(TradeDto record);
}