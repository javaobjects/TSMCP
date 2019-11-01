package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpProductOrderExample;
import com.tencent.pojo.TsmcpProductOrder;

import java.util.List;

@Mapper
public interface TsmcpProductOrderMapper {
    long countByExample(TsmcpProductOrderExample example);

    int deleteByExample(TsmcpProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpProductOrder record);

    int insertSelective(TsmcpProductOrder record);

    List<TsmcpProductOrder> selectByExample(TsmcpProductOrderExample example);

    TsmcpProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpProductOrder record, @Param("example") TsmcpProductOrderExample example);

    int updateByExample(@Param("record") TsmcpProductOrder record, @Param("example") TsmcpProductOrderExample example);

    int updateByPrimaryKeySelective(TsmcpProductOrder record);

    int updateByPrimaryKey(TsmcpProductOrder record);
}