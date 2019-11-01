import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpEquipmentProductExample;
import com.tencent.pojo.TsmcpEquipmentProduct;

import java.util.List;

@Mapper
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