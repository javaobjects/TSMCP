package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpProductPlanMapper {
    long countByExample(com.tencent.pojo.TsmcpProductPlanExample example);

    int deleteByExample(com.tencent.pojo.TsmcpProductPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpProductPlan record);

    int insertSelective(com.tencent.pojo.TsmcpProductPlan record);

    List<com.tencent.pojo.TsmcpProductPlan> selectByExample(com.tencent.pojo.TsmcpProductPlanExample example);

    com.tencent.pojo.TsmcpProductPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpProductPlan record, @Param("example") com.tencent.pojo.TsmcpProductPlanExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpProductPlan record, @Param("example") com.tencent.pojo.TsmcpProductPlanExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpProductPlan record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpProductPlan record);
}