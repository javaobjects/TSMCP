package com.tencent.mapper;

import com.tencent.pojo.TsmcpEquipmentProduct;
import com.tencent.pojo.TsmcpEquipmentProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsmcpEquipmentProductMapper {
    long countByExample(TsmcpEquipmentProductExample example);

    int deleteByExample(TsmcpEquipmentProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpEquipmentProduct record);

    int insertSelective(TsmcpEquipmentProduct record);

    List<TsmcpEquipmentProduct> selectByExample(TsmcpEquipmentProductExample example);

    TsmcpEquipmentProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpEquipmentProduct record, @Param("example") TsmcpEquipmentProductExample example);

    int updateByExample(@Param("record") TsmcpEquipmentProduct record, @Param("example") TsmcpEquipmentProductExample example);

    int updateByPrimaryKeySelective(TsmcpEquipmentProduct record);

    int updateByPrimaryKey(TsmcpEquipmentProduct record);
}