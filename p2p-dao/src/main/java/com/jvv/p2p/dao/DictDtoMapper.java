package com.jvv.p2p.dao;

import com.jvv.p2p.entity.DictDto;
import com.jvv.p2p.entity.DictDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictDtoMapper {
    int countByExample(DictDtoExample example);

    int deleteByExample(DictDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(DictDto record);

    int insertSelective(DictDto record);

    List<DictDto> selectByExample(DictDtoExample example);

    DictDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DictDto record, @Param("example") DictDtoExample example);

    int updateByExample(@Param("record") DictDto record, @Param("example") DictDtoExample example);

    int updateByPrimaryKeySelective(DictDto record);

    int updateByPrimaryKey(DictDto record);
}