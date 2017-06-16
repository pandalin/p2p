package com.jvv.p2p.dao;

import com.jvv.p2p.entity.WithDrawFlowDto;
import com.jvv.p2p.entity.WithDrawFlowDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WithDrawFlowDtoMapper {
    int countByExample(WithDrawFlowDtoExample example);

    int deleteByExample(WithDrawFlowDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(WithDrawFlowDto record);

    int insertSelective(WithDrawFlowDto record);

    List<WithDrawFlowDto> selectByExample(WithDrawFlowDtoExample example);

    WithDrawFlowDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WithDrawFlowDto record, @Param("example") WithDrawFlowDtoExample example);

    int updateByExample(@Param("record") WithDrawFlowDto record, @Param("example") WithDrawFlowDtoExample example);

    int updateByPrimaryKeySelective(WithDrawFlowDto record);

    int updateByPrimaryKey(WithDrawFlowDto record);
}