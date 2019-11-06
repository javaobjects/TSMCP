package com.tencent.service.impl;

import com.tencent.mapper.TsmcpPermitMapper;
import com.tencent.pojo.TsmcpPermit;
import com.tencent.service.ITsmcpPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ITsmcpPermitService")
@Transactional  //开启注解事务
public class ITsmcpPermitServiceImpl implements ITsmcpPermitService {

    @Autowired
    private TsmcpPermitMapper tsmcpPermitMapper;

    /**
     * 获取指定角色所有权限
     */
    @Override
    public List<TsmcpPermit> listByRoleId(Integer Id) {
        return tsmcpPermitMapper.listByRoleId(Id);
    }
}
