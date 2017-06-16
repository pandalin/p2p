package com.jvv.p2p.dao;

import com.jvv.p2p.entity.RechargeFlowDto;
import com.jvv.p2p.entity.RechargeFlowDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RechargeFlowDtoMapper {
    int countByExample(RechargeFlowDtoExample example);

    int deleteByExample(RechargeFlowDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RechargeFlowDto record);

    int insertSelective(RechargeFlowDto record);

    List<RechargeFlowDto> selectByExample(RechargeFlowDtoExample example);

    RechargeFlowDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RechargeFlowDto record, @Param("example") RechargeFlowDtoExample example);

    int updateByExample(@Param("record") RechargeFlowDto record, @Param("example") RechargeFlowDtoExample example);

    int updateByPrimaryKeySelective(RechargeFlowDto record);

    int updateByPrimaryKey(RechargeFlowDto record);
}