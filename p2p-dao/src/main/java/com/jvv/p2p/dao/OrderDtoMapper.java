package com.jvv.p2p.dao;

import com.jvv.p2p.entity.OrderDto;
import com.jvv.p2p.entity.OrderDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDtoMapper {
    int countByExample(OrderDtoExample example);

    int deleteByExample(OrderDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDto record);

    int insertSelective(OrderDto record);

    List<OrderDto> selectByExample(OrderDtoExample example);

    OrderDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDto record, @Param("example") OrderDtoExample example);

    int updateByExample(@Param("record") OrderDto record, @Param("example") OrderDtoExample example);

    int updateByPrimaryKeySelective(OrderDto record);

    int updateByPrimaryKey(OrderDto record);
}