package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpDailyWorkMapper {
    long countByExample(com.tencent.pojo.TsmcpDailyWorkExample example);

    int deleteByExample(com.tencent.pojo.TsmcpDailyWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpDailyWork record);

    int insertSelective(com.tencent.pojo.TsmcpDailyWork record);

    List<com.tencent.pojo.TsmcpDailyWork> selectByExample(com.tencent.pojo.TsmcpDailyWorkExample example);

    com.tencent.pojo.TsmcpDailyWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpDailyWork record, @Param("example") com.tencent.pojo.TsmcpDailyWorkExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpDailyWork record, @Param("example") com.tencent.pojo.TsmcpDailyWorkExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpDailyWork record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpDailyWork record);
}