package com.tencent.service;

import com.tencent.pojo.TsmcpRolePermit;

import java.util.List;

public interface ITsmcpRolePermitService {
    public List<TsmcpRolePermit> listByUserId(Integer userId);
}
