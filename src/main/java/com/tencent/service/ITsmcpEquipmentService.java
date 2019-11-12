package com.tencent.service;

public interface ITsmcpEquipmentService {

    //查询所有设备
    public Integer selectAllEquipment();

    //查询所有故障的设备
    public Integer selectBadEquipment();

}
