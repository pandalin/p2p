package com.jvv.p2p.dao;

import com.jvv.p2p.entity.RepayFlowDto;
import com.jvv.p2p.entity.RepayFlowDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepayFlowDtoMapper {
    int countByExample(RepayFlowDtoExample example);

    int deleteByExample(RepayFlowDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RepayFlowDto record);

    int insertSelective(RepayFlowDto record);

    List<RepayFlowDto> selectByExample(RepayFlowDtoExample example);

    RepayFlowDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RepayFlowDto record, @Param("example") RepayFlowDtoExample example);

    int updateByExample(@Param("record") RepayFlowDto record, @Param("example") RepayFlowDtoExample example);

    int updateByPrimaryKeySelective(RepayFlowDto record);

    int updateByPrimaryKey(RepayFlowDto record);
}