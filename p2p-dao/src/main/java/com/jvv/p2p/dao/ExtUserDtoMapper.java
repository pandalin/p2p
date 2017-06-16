package com.jvv.p2p.dao;

import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.p2p.entity.ExtUserDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtUserDtoMapper {
    int countByExample(ExtUserDtoExample example);

    int deleteByExample(ExtUserDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExtUserDto record);

    int insertSelective(ExtUserDto record);

    List<ExtUserDto> selectByExample(ExtUserDtoExample example);

    ExtUserDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExtUserDto record, @Param("example") ExtUserDtoExample example);

    int updateByExample(@Param("record") ExtUserDto record, @Param("example") ExtUserDtoExample example);

    int updateByPrimaryKeySelective(ExtUserDto record);

    int updateByPrimaryKey(ExtUserDto record);
    
    //获取金窝窝用户密码
    String selectJwwPassword(String userId);
}