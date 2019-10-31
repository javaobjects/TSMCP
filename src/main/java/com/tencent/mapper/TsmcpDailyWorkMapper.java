package com.tencent.tsmcp.mapper;

import com.tencent.tsmcp.pojo.TsmcpDailyWork;
import com.tencent.tsmcp.pojo.TsmcpDailyWorkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TsmcpDailyWorkMapper {
    long countByExample(TsmcpDailyWorkExample example);

    int deleteByExample(TsmcpDailyWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpDailyWork record);

    int insertSelective(TsmcpDailyWork record);

    List<TsmcpDailyWork> selectByExample(TsmcpDailyWorkExample example);

    TsmcpDailyWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpDailyWork record, @Param("example") TsmcpDailyWorkExample example);

    int updateByExample(@Param("record") TsmcpDailyWork record, @Param("example") TsmcpDailyWorkExample example);

    int updateByPrimaryKeySelective(TsmcpDailyWork record);

    int updateByPrimaryKey(TsmcpDailyWork record);
}