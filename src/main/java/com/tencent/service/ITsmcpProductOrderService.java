package com.tencent.service;

import com.tencent.pojo.TsmcpProductOrder;
import com.tencent.pojo.TsmcpProductOrderSum;

import java.util.List;

public interface ITsmcpProductOrderService {
    List<TsmcpProductOrderSum> selectOrderStatusSum();
}
