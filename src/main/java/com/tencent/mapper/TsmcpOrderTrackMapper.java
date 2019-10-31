package com.tencent.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsmcpOrderTrackMapper {
    long countByExample(com.tencent.pojo.TsmcpOrderTrackExample example);

    int deleteByExample(com.tencent.pojo.TsmcpOrderTrackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(com.tencent.pojo.TsmcpOrderTrack record);

    int insertSelective(com.tencent.pojo.TsmcpOrderTrack record);

    List<com.tencent.pojo.TsmcpOrderTrack> selectByExample(com.tencent.pojo.TsmcpOrderTrackExample example);

    com.tencent.pojo.TsmcpOrderTrack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") com.tencent.pojo.TsmcpOrderTrack record, @Param("example") com.tencent.pojo.TsmcpOrderTrackExample example);

    int updateByExample(@Param("record") com.tencent.pojo.TsmcpOrderTrack record, @Param("example") com.tencent.pojo.TsmcpOrderTrackExample example);

    int updateByPrimaryKeySelective(com.tencent.pojo.TsmcpOrderTrack record);

    int updateByPrimaryKey(com.tencent.pojo.TsmcpOrderTrack record);
}