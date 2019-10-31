package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpProductMapper {
    long countByExample(com.tencent.pojo.TsmcpProductExample example);

    int deleteByExample(com.tencent.pojo.TsmcpProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpProduct record);

    int insertSelective(com.tencent.pojo.TsmcpProduct record);

    List<com.tencent.pojo.TsmcpProduct> selectByExample(com.tencent.pojo.TsmcpProductExample example);

    com.tencent.pojo.TsmcpProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpProduct record, @Param("example") com.tencent.pojo.TsmcpProductExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpProduct record, @Param("example") com.tencent.pojo.TsmcpProductExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpProduct record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpProduct record);
}