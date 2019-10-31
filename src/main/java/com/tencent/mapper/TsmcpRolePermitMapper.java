package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpRolePermitMapper {
    long countByExample(com.tencent.pojo.TsmcpRolePermitExample example);

    int deleteByExample(com.tencent.pojo.TsmcpRolePermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpRolePermit record);

    int insertSelective(com.tencent.pojo.TsmcpRolePermit record);

    List<com.tencent.pojo.TsmcpRolePermit> selectByExample(com.tencent.pojo.TsmcpRolePermitExample example);

    com.tencent.pojo.TsmcpRolePermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpRolePermit record, @Param("example") com.tencent.pojo.TsmcpRolePermitExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpRolePermit record, @Param("example") com.tencent.pojo.TsmcpRolePermitExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpRolePermit record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpRolePermit record);
}