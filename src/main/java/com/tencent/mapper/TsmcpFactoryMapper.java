package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpFactoryMapper {
    long countByExample(com.tencent.pojo.TsmcpFactoryExample example);

    int deleteByExample(com.tencent.pojo.TsmcpFactoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpFactory record);

    int insertSelective(com.tencent.pojo.TsmcpFactory record);

    List<com.tencent.pojo.TsmcpFactory> selectByExample(com.tencent.pojo.TsmcpFactoryExample example);

    com.tencent.pojo.TsmcpFactory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpFactory record, @Param("example") com.tencent.pojo.TsmcpFactoryExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpFactory record, @Param("example") com.tencent.pojo.TsmcpFactoryExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpFactory record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpFactory record);
}