package com.tencent.service.impl;

import com.tencent.mapper.TsmcpUserRoleMapper;
import com.tencent.pojo.TsmcpUserRole;
import com.tencent.service.ITsmcpUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ITsmcpUserRoleService")
@Transactional  //开启注解事务
public class ITsmcpUserRoleServiceImpl implements ITsmcpUserRoleService {

    @Autowired
    private TsmcpUserRoleMapper tsmcpUserRoleMapper;

    @Override
    public TsmcpUserRole selectById(Integer id) {
        return tsmcpUserRoleMapper.selectById(id);
    }
}
