package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.tencent.pojo.TsmcpOrderTrackExample;
import com.tencent.pojo.TsmcpOrderTrack;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
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