package com.tencent.service.impl;

import com.tencent.mapper.TsmcpUserMapper;
import com.tencent.pojo.TsmcpUser;
import com.tencent.service.ITsmcpUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName ITsmcpUserServiceImpl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月29日 18:45:00
 */
@Service("ITsmcpUserService")
public class ITsmcpUserServiceImpl implements ITsmcpUserService {

    @Resource(name = "tsmcpUserMapper")//默认根据名称匹配
    private TsmcpUserMapper tsmcpUserMapper;

    @Override
    public TsmcpUser Login(String user_name, String user_password) {
        TsmcpUser tsmcpUser = tsmcpUserMapper.Login(user_name,user_password);
        return tsmcpUser;
    }
}
