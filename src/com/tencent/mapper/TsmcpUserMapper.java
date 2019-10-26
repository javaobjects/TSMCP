package com.tencent.mapper;

import com.tencent.pojo.TsmcpUser;
import com.tencent.pojo.TsmcpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsmcpUserMapper {
    long countByExample(TsmcpUserExample example);

    int deleteByExample(TsmcpUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpUser record);

    int insertSelective(TsmcpUser record);

    List<TsmcpUser> selectByExample(TsmcpUserExample example);

    TsmcpUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpUser record, @Param("example") TsmcpUserExample example);

    int updateByExample(@Param("record") TsmcpUser record, @Param("example") TsmcpUserExample example);

    int updateByPrimaryKeySelective(TsmcpUser record);

    int updateByPrimaryKey(TsmcpUser record);
}