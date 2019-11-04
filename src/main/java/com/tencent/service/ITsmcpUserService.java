package com.tencent.service;

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
     * @param user_name
     * @param user_password
     * @return Boolean
     * @author xianxian
     * @create:2019-10-29
     * @Description
     * 用户登录
     */
    public List<TsmcpUser> Login(String user_name, String user_password);

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
}
