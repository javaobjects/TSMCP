package com.tencent.service.impl;

import com.tencent.mapper.TsmcpPermitMapper;
import com.tencent.mapper.TsmcpProductMapper;
import com.tencent.mapper.TsmcpProductOrderMapper;
import com.tencent.pojo.TsmcpProductOrder;
import com.tencent.pojo.TsmcpProductOrderSum;
import com.tencent.service.ITsmcpProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ITsmcpProductOrderService")
@Transactional  //开启注解事务
public class ITsmcpProductOrderServiceImpl implements ITsmcpProductOrderService {

    @Autowired
    private TsmcpProductOrderMapper tsmcpProductOrderMapper;

    @Override
    public List<TsmcpProductOrderSum> selectOrderStatusSum() {
        return tsmcpProductOrderMapper.selectOrderStatusSum();
    }
}
