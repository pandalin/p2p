package com.jvv.p2p.dao;

import com.jvv.p2p.entity.TradeFlowDto;
import com.jvv.p2p.entity.TradeFlowDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeFlowDtoMapper {
    int countByExample(TradeFlowDtoExample example);

    int deleteByExample(TradeFlowDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TradeFlowDto record);

    int insertSelective(TradeFlowDto record);

    List<TradeFlowDto> selectByExample(TradeFlowDtoExample example);

    TradeFlowDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TradeFlowDto record, @Param("example") TradeFlowDtoExample example);

    int updateByExample(@Param("record") TradeFlowDto record, @Param("example") TradeFlowDtoExample example);

    int updateByPrimaryKeySelective(TradeFlowDto record);

    int updateByPrimaryKey(TradeFlowDto record);
}