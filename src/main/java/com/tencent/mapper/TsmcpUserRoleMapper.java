package com.tencent.mapper;


import java.util.List;
import com.tencent.pojo.TsmcpUserRole;
import com.tencent.pojo.TsmcpUserRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TsmcpUserRoleMapper {
    long countByExample(TsmcpUserRoleExample example);

    int deleteByExample(TsmcpUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TsmcpUserRole record);

    int insertSelective(TsmcpUserRole record);

    List<TsmcpUserRole> selectByExample(TsmcpUserRoleExample example);

    TsmcpUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TsmcpUserRole record, @Param("example") TsmcpUserRoleExample example);

    int updateByExample(@Param("record") TsmcpUserRole record, @Param("example") TsmcpUserRoleExample example);

    int updateByPrimaryKeySelective(TsmcpUserRole record);

    int updateByPrimaryKey(TsmcpUserRole record);

    //通过id找权限
    TsmcpUserRole selectById(@Param("id") Integer id);

}