package com.tencent.mapper;

import com.tencent.pojo.TsmcpProduct;
import com.tencent.pojo.TsmcpProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TsmcpProductMapper {
    long countByExample(TsmcpProductExample example);

    int deleteByExample(TsmcpProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpProduct record);

    int insertSelective(TsmcpProduct record);

    List<TsmcpProduct> selectByExample(TsmcpProductExample example);

    TsmcpProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpProduct record, @Param("example") TsmcpProductExample example);

    int updateByExample(@Param("record") TsmcpProduct record, @Param("example") TsmcpProductExample example);

    int updateByPrimaryKeySelective(TsmcpProduct record);

    int updateByPrimaryKey(TsmcpProduct record);

    List<TsmcpProduct> selectAll();

    List<TsmcpProduct> selectAll2();
}