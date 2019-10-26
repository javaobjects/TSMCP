package com.tencent.mapper;

import com.tencent.pojo.TsmcpProductPlan;
import com.tencent.pojo.TsmcpProductPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsmcpProductPlanMapper {
    long countByExample(TsmcpProductPlanExample example);

    int deleteByExample(TsmcpProductPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpProductPlan record);

    int insertSelective(TsmcpProductPlan record);

    List<TsmcpProductPlan> selectByExample(TsmcpProductPlanExample example);

    TsmcpProductPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpProductPlan record, @Param("example") TsmcpProductPlanExample example);

    int updateByExample(@Param("record") TsmcpProductPlan record, @Param("example") TsmcpProductPlanExample example);

    int updateByPrimaryKeySelective(TsmcpProductPlan record);

    int updateByPrimaryKey(TsmcpProductPlan record);
}