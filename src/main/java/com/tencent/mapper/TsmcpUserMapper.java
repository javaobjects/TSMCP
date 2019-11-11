package com.tencent.mapper;

import java.util.List;
import com.tencent.pojo.TsmcpUser;
import com.tencent.pojo.TsmcpUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
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
     *
     */

    public List<TsmcpUser> Login(@Param("user_name") String user_name, @Param("user_password") String user_password);

    public List<TsmcpUser> selectAll();

    public TsmcpUser isExistUsername(String username);

    //通过id查找用户
    public TsmcpUser selectById(@Param("id") Integer id);

    //通过name查找用户
    public TsmcpUser selectByName(@Param("name") String name);

    public List<Integer> getAllFactoryIds();

    public Integer insertIntoTsmcpUser(TsmcpUser tsmcpUser);

    //查询7天内的新用户，用于图形界面
    public Integer selectNewUser();
}