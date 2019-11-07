package com.tencent.service;

import com.tencent.pojo.TsmcpProduct;

import java.util.List;
import java.util.Map;

public interface ITsmcpProductService {
    public List<TsmcpProduct> selectAll();
    Map<String ,Object> selectAll2();
}
