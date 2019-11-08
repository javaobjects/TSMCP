package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpEquipmentExample;
import com.tencent.pojo.TsmcpEquipment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
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