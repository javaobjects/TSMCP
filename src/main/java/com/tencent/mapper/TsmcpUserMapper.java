package com.tencent.tsmcp.mapper;


import com.tencent.tsmcp.pojo.TsmcpUserExample;
import java.util.List;
import com.tencent.tsmcp.pojo.TsmcpUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
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


    /**
     * @param user_name
     * @param user_password
     * @return Boolean
     * @author xianxian
     * @create:2019-10-29
     * @Description
     * 用户登录
     *   <select id="login" parameterType="String" resultType="com.tencent.pojo.TsmcpUser">
     */

    public TsmcpUser Login(@Param("user_name") String user_name, @Param("user_password") String user_password);
}