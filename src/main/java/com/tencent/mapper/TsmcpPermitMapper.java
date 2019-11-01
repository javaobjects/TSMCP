package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpPermitExample;
import com.tencent.pojo.TsmcpPermit;

import java.util.List;

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