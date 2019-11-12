package com.tencent.service.impl;

import com.tencent.mapper.TsmcpEquipmentMapper;
import com.tencent.service.ITsmcpEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ITsmcpEquipmentService")
@Transactional  //开启注解事务
public class ITsmcpEquipmentServiceImpl implements ITsmcpEquipmentService {

    @Autowired
    private TsmcpEquipmentMapper tsmcpEquipmentMapper;

    @Override
    public Integer selectAllEquipment() {
        return tsmcpEquipmentMapper.selectAlleq();
    }

    @Override
    public Integer selectBadEquipment() {
        return tsmcpEquipmentMapper.selectBadeq();
    }
}
