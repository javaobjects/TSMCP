package com.tencent.tsmcp.mapper;

import com.tencent.tsmcp.pojo.TsmcpFactory;
import com.tencent.tsmcp.pojo.TsmcpFactoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TsmcpFactoryMapper {
    long countByExample(TsmcpFactoryExample example);

    int deleteByExample(TsmcpFactoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpFactory record);

    int insertSelective(TsmcpFactory record);

    List<TsmcpFactory> selectByExample(TsmcpFactoryExample example);

    TsmcpFactory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpFactory record, @Param("example") TsmcpFactoryExample example);

    int updateByExample(@Param("record") TsmcpFactory record, @Param("example") TsmcpFactoryExample example);

    int updateByPrimaryKeySelective(TsmcpFactory record);

    int updateByPrimaryKey(TsmcpFactory record);
}