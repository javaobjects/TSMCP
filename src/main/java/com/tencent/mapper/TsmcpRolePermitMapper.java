package com.tencent.mapper;

import com.tencent.pojo.TsmcpRolePermit;
import com.tencent.pojo.TsmcpRolePermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsmcpRolePermitMapper {
    long countByExample(TsmcpRolePermitExample example);

    int deleteByExample(TsmcpRolePermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpRolePermit record);

    int insertSelective(TsmcpRolePermit record);

    List<TsmcpRolePermit> selectByExample(TsmcpRolePermitExample example);

    TsmcpRolePermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpRolePermit record, @Param("example") TsmcpRolePermitExample example);

    int updateByExample(@Param("record") TsmcpRolePermit record, @Param("example") TsmcpRolePermitExample example);

    int updateByPrimaryKeySelective(TsmcpRolePermit record);

    int updateByPrimaryKey(TsmcpRolePermit record);
}