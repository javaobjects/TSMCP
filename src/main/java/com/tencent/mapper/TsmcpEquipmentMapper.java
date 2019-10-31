package com.tencent.tsmcp.mapper;

import com.tencent.tsmcp.pojo.TsmcpEquipment;
import com.tencent.tsmcp.pojo.TsmcpEquipmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TsmcpEquipmentMapper {
    long countByExample(TsmcpEquipmentExample example);

    int deleteByExample(TsmcpEquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpEquipment record);

    int insertSelective(TsmcpEquipment record);

    List<TsmcpEquipment> selectByExample(TsmcpEquipmentExample example);

    TsmcpEquipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpEquipment record, @Param("example") TsmcpEquipmentExample example);

    int updateByExample(@Param("record") TsmcpEquipment record, @Param("example") TsmcpEquipmentExample example);

    int updateByPrimaryKeySelective(TsmcpEquipment record);

    int updateByPrimaryKey(TsmcpEquipment record);
}