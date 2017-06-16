package com.jvv.p2p.dao;

import com.jvv.p2p.entity.DemandDto;
import com.jvv.p2p.entity.DemandDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemandDtoMapper {
    int countByExample(DemandDtoExample example);

    int deleteByExample(DemandDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(DemandDto record);

    int insertSelective(DemandDto record);

    List<DemandDto> selectByExample(DemandDtoExample example);

    DemandDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DemandDto record, @Param("example") DemandDtoExample example);

    int updateByExample(@Param("record") DemandDto record, @Param("example") DemandDtoExample example);

    int updateByPrimaryKeySelective(DemandDto record);

    int updateByPrimaryKey(DemandDto record);
}