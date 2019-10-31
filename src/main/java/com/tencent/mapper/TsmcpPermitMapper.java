package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpPermitMapper {
    long countByExample(com.tencent.pojo.TsmcpPermitExample example);

    int deleteByExample(com.tencent.pojo.TsmcpPermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpPermit record);

    int insertSelective(com.tencent.pojo.TsmcpPermit record);

    List<com.tencent.pojo.TsmcpPermit> selectByExample(com.tencent.pojo.TsmcpPermitExample example);

    com.tencent.pojo.TsmcpPermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpPermit record, @Param("example") com.tencent.pojo.TsmcpPermitExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpPermit record, @Param("example") com.tencent.pojo.TsmcpPermitExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpPermit record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpPermit record);
}