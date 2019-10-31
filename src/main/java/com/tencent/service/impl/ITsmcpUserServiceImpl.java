package com.tencent.tsmcp.service.impl;


import com.tencent.tsmcp.mapper.TsmcpUserMapper;
import com.tencent.tsmcp.service.ITsmcpUserService;
import com.tencent.tsmcp.pojo.TsmcpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @ClassName ITsmcpUserServiceImpl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月29日 18:45:00
 */

@Service("ITsmcpUserService")
@Transactional  //开启注解事务
public class ITsmcpUserServiceImpl implements ITsmcpUserService {

    @Autowired
    private TsmcpUserMapper tsmcpUserMapper;

    @Override
    public TsmcpUser Login(String user_name, String user_password) {
        TsmcpUser tsmcpUser = tsmcpUserMapper.Login(user_name,user_password);
        return tsmcpUser;
    }
}
