package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpFactoryExample;
import com.tencent.pojo.TsmcpFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
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