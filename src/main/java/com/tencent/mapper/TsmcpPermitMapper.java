package com.tencent.tsmcp.mapper;

import com.tencent.tsmcp.pojo.TsmcpPermit;
import com.tencent.tsmcp.pojo.TsmcpPermitExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TsmcpPermitMapper {
    long countByExample(TsmcpPermitExample example);

    int deleteByExample(TsmcpPermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpPermit record);

    int insertSelective(TsmcpPermit record);

    List<TsmcpPermit> selectByExample(TsmcpPermitExample example);

    TsmcpPermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpPermit record, @Param("example") TsmcpPermitExample example);

    int updateByExample(@Param("record") TsmcpPermit record, @Param("example") TsmcpPermitExample example);

    int updateByPrimaryKeySelective(TsmcpPermit record);

    int updateByPrimaryKey(TsmcpPermit record);
}