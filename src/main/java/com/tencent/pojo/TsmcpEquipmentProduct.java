package com.tencent.tsmcp.pojo;

public class TsmcpEquipmentProduct {
    private Integer id;

    private Integer equipmentId;

    private Integer productId;

    private Integer yield;

    private Integer unit;

    private Integer factoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }
}