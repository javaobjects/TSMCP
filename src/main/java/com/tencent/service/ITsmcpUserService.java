package com.tencent.service;

import com.alibaba.fastjson.JSONArray;
import com.tencent.pojo.TsmcpUser;

import java.util.List;

/**
 * @author xianxian
 * @version 1.0.0
 * @ClassName ITsmcpUserService.java
 * @Description TODO
 * @createTime 2019年10月29日 18:29:00
 */
public interface ITsmcpUserService {

    /**
     *
     * @param username
     * @param password
     * @return
     * @author xianxian
     * @create:2019-11-05
     * @Description
     * 用户登录
     */
    public JSONArray Login(String username, String password);

    public List<TsmcpUser> selectAll();

    /**
     * 查询用户名是否已存在
     * @param username
     * @return Boolean
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    public Boolean isExistUsername(String username);

    /**
     * 获取所有的工厂ID
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    public List<Integer> getAllFactoryIds();

    /**
     * 用户注册
     * @param tsmcpUser
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    public Boolean insertIntoTsmcpUser(TsmcpUser tsmcpUser);

    public TsmcpUser selectById(Integer id);

    public TsmcpUser selectByName(String name);

    public Integer selectNewUser();

}
