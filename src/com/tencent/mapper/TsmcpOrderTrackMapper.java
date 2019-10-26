package com.tencent.mapper;

import com.tencent.pojo.TsmcpOrderTrack;
import com.tencent.pojo.TsmcpOrderTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsmcpOrderTrackMapper {
    long countByExample(TsmcpOrderTrackExample example);

    int deleteByExample(TsmcpOrderTrackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpOrderTrack record);

    int insertSelective(TsmcpOrderTrack record);

    List<TsmcpOrderTrack> selectByExample(TsmcpOrderTrackExample example);

    TsmcpOrderTrack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpOrderTrack record, @Param("example") TsmcpOrderTrackExample example);

    int updateByExample(@Param("record") TsmcpOrderTrack record, @Param("example") TsmcpOrderTrackExample example);

    int updateByPrimaryKeySelective(TsmcpOrderTrack record);

    int updateByPrimaryKey(TsmcpOrderTrack record);
}