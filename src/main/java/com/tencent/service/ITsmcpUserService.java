package com.tencent.tsmcp.service;


import com.tencent.tsmcp.pojo.TsmcpUser;

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
    public TsmcpUser Login(String user_name, String user_password);
}
