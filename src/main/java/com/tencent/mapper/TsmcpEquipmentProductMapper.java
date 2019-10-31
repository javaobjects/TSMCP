import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpEquipmentProductMapper {
    long countByExample(com.tencent.pojo.TsmcpEquipmentProductExample example);

    int deleteByExample(com.tencent.pojo.TsmcpEquipmentProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpEquipmentProduct record);

    int insertSelective(com.tencent.pojo.TsmcpEquipmentProduct record);

    List<com.tencent.pojo.TsmcpEquipmentProduct> selectByExample(com.tencent.pojo.TsmcpEquipmentProductExample example);

    com.tencent.pojo.TsmcpEquipmentProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpEquipmentProduct record, @Param("example") com.tencent.pojo.TsmcpEquipmentProductExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpEquipmentProduct record, @Param("example") com.tencent.pojo.TsmcpEquipmentProductExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpEquipmentProduct record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpEquipmentProduct record);
}