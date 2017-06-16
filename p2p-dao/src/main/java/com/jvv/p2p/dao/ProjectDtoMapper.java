package com.jvv.p2p.dao;

import com.jvv.p2p.entity.ProjectDto;
import com.jvv.p2p.entity.ProjectDtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectDtoMapper {
    int countByExample(ProjectDtoExample example);

    int deleteByExample(ProjectDtoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectDto record);

    int insertSelective(ProjectDto record);

    List<ProjectDto> selectByExample(ProjectDtoExample example);

    ProjectDto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectDto record, @Param("example") ProjectDtoExample example);

    int updateByExample(@Param("record") ProjectDto record, @Param("example") ProjectDtoExample example);

    int updateByPrimaryKeySelective(ProjectDto record);

    int updateByPrimaryKey(ProjectDto record);
}