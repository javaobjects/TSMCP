package com.tencent.service;


import com.tencent.pojo.TsmcpPermit;

import java.util.List;

public interface ITsmcpPermitService {
    /**
     * 获取指定角色所有权限
     */
    public List<TsmcpPermit> listByRoleId(Integer Id);
}
