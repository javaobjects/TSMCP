import com.tencent.pojo.TsmcpProductSchedule;
import com.tencent.pojo.TsmcpProductScheduleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpProductScheduleMapper {
    long countByExample(TsmcpProductScheduleExample example);

    int deleteByExample(TsmcpProductScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpProductSchedule record);

    int insertSelective(TsmcpProductSchedule record);

    List<TsmcpProductSchedule> selectByExample(TsmcpProductScheduleExample example);

    TsmcpProductSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpProductSchedule record, @Param("example") TsmcpProductScheduleExample example);

    int updateByExample(@Param("record") TsmcpProductSchedule record, @Param("example") TsmcpProductScheduleExample example);

    int updateByPrimaryKeySelective(TsmcpProductSchedule record);

    int updateByPrimaryKey(TsmcpProductSchedule record);
}