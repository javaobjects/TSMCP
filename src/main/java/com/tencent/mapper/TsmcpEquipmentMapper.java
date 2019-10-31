package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpEquipmentMapper {
    long countByExample(com.tencent.pojo.TsmcpEquipmentExample example);

    int deleteByExample(com.tencent.pojo.TsmcpEquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpEquipment record);

    int insertSelective(com.tencent.pojo.TsmcpEquipment record);

    List<com.tencent.pojo.TsmcpEquipment> selectByExample(com.tencent.pojo.TsmcpEquipmentExample example);

    com.tencent.pojo.TsmcpEquipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpEquipment record, @Param("example") com.tencent.pojo.TsmcpEquipmentExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpEquipment record, @Param("example") com.tencent.pojo.TsmcpEquipmentExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpEquipment record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpEquipment record);
}