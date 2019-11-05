package com.tencent.service.impl;

import com.tencent.mapper.TsmcpRolePermitMapper;
import com.tencent.pojo.TsmcpRolePermit;
import com.tencent.service.ITsmcpRolePermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ITsmcpRolePermitService")
@Transactional  //开启注解事务
public class ITsmcpRolePermitServiceImpl implements ITsmcpRolePermitService {

    @Autowired
    private TsmcpRolePermitMapper tsmcpRolePermitMapper;

    @Override
    public List<TsmcpRolePermit> listByUserId(Integer userId) {
        return tsmcpRolePermitMapper.listByUserId(userId);
    }
}
