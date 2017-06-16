package com.jvv.p2p.dao;

import com.jvv.p2p.entity.ChannelDto;
import com.jvv.p2p.entity.ChannelDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChannelDtoMapper {
    int countByExample(ChannelDtoExample example);

    int deleteByExample(ChannelDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChannelDto record);

    int insertSelective(ChannelDto record);

    List<ChannelDto> selectByExample(ChannelDtoExample example);

    ChannelDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChannelDto record, @Param("example") ChannelDtoExample example);

    int updateByExample(@Param("record") ChannelDto record, @Param("example") ChannelDtoExample example);

    int updateByPrimaryKeySelective(ChannelDto record);

    int updateByPrimaryKey(ChannelDto record);
}