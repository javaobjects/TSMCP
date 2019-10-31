import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpProductScheduleMapper {
    long countByExample(com.tencent.pojo.TsmcpProductScheduleExample example);

    int deleteByExample(com.tencent.pojo.TsmcpProductScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpProductSchedule record);

    int insertSelective(com.tencent.pojo.TsmcpProductSchedule record);

    List<com.tencent.pojo.TsmcpProductSchedule> selectByExample(com.tencent.pojo.TsmcpProductScheduleExample example);

    com.tencent.pojo.TsmcpProductSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpProductSchedule record, @Param("example") com.tencent.pojo.TsmcpProductScheduleExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpProductSchedule record, @Param("example") com.tencent.pojo.TsmcpProductScheduleExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpProductSchedule record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpProductSchedule record);
}