package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpProductOrderMapper {
    long countByExample(com.tencent.pojo.TsmcpProductOrderExample example);

    int deleteByExample(com.tencent.pojo.TsmcpProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpProductOrder record);

    int insertSelective(com.tencent.pojo.TsmcpProductOrder record);

    List<com.tencent.pojo.TsmcpProductOrder> selectByExample(com.tencent.pojo.TsmcpProductOrderExample example);

    com.tencent.pojo.TsmcpProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpProductOrder record, @Param("example") com.tencent.pojo.TsmcpProductOrderExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpProductOrder record, @Param("example") com.tencent.pojo.TsmcpProductOrderExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpProductOrder record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpProductOrder record);
}