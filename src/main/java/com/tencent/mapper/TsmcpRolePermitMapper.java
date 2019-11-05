package com.tencent.mapper;


import java.util.List;
import com.tencent.pojo.TsmcpRolePermit;
import com.tencent.pojo.TsmcpRolePermitExample;
import com.tencent.pojo.TsmcpRolePermitKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TsmcpRolePermitMapper {
    long countByExample(TsmcpRolePermitExample example);

    int deleteByExample(TsmcpRolePermitExample example);

    int deleteByPrimaryKey(TsmcpRolePermitKey key);

    int insert(TsmcpRolePermit record);

    int insertSelective(TsmcpRolePermit record);

    List<TsmcpRolePermit> selectByExample(TsmcpRolePermitExample example);

    TsmcpRolePermit selectByPrimaryKey(TsmcpRolePermitKey key);

    int updateByExampleSelective(@Param("record") TsmcpRolePermit record, @Param("example") TsmcpRolePermitExample example);

    int updateByExample(@Param("record") TsmcpRolePermit record, @Param("example") TsmcpRolePermitExample example);

    int updateByPrimaryKeySelective(TsmcpRolePermit record);

    int updateByPrimaryKey(TsmcpRolePermit record);

    //根据用户id查权限id
    List<TsmcpRolePermit> listByUserId(@Param("userId") Integer id);
}