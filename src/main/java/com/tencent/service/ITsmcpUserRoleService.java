package com.tencent.service;

import com.tencent.pojo.TsmcpPermit;
import com.tencent.pojo.TsmcpUserRole;

public interface ITsmcpUserRoleService {

    public TsmcpUserRole selectById(Integer id);

    public TsmcpUserRole selectByName(String name);

}
