package com.tencent.service.impl;

import com.tencent.mapper.TsmcpUserMapper;
import com.tencent.pojo.TsmcpUser;
import com.tencent.service.ITsmcpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName ITsmcpUserServiceImpl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月29日 18:45:00
 */

@Service("ITsmcpUserService")
@Transactional  //开启注解事务
public class ITsmcpUserServiceImpl implements ITsmcpUserService , Serializable {

    @Autowired
    private TsmcpUserMapper tsmcpUserMapper;

    @Override
    public List<TsmcpUser> Login(String user_name, String user_password) {
        List<TsmcpUser> tsmcpUser = tsmcpUserMapper.Login(user_name,user_password);
        return tsmcpUser;
    }

    @Override
    public List<TsmcpUser> selectAll() {

        return tsmcpUserMapper.selectAll();
    }

    @Override
    public Boolean isExistUsername(String username) {
        TsmcpUser tsmcpUser = tsmcpUserMapper.isExistUsername(username);
        if(tsmcpUser == null){
            return true;//表示不存在可注册
        }else {
            return false;
        }
    }
}
