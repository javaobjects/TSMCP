package com.tencent.pojo;

import java.util.Date;

public class TsmcpDailyWork {
    private Integer id;

    private Integer flag;

    private Date createTime;

    private Integer createUserid;

    private Date updateTime;

    private Integer updateUserid;

    private Integer scheduleId;

    private Integer equipmentId;

    private String equipmentSeq;

    private Date startTime;

    private Date endTime;

    private Integer workingCount;

    private Integer qualifiedCount;

    private Integer unqualifiedCout;

    private Integer completeFlag;

    private Integer factoryId;

    private String bak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentSeq() {
        return equipmentSeq;
    }

    public void setEquipmentSeq(String equipmentSeq) {
        this.equipmentSeq = equipmentSeq == null ? null : equipmentSeq.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getWorkingCount() {
        return workingCount;
    }

    public void setWorkingCount(Integer workingCount) {
        this.workingCount = workingCount;
    }

    public Integer getQualifiedCount() {
        return qualifiedCount;
    }

    public void setQualifiedCount(Integer qualifiedCount) {
        this.qualifiedCount = qualifiedCount;
    }

    public Integer getUnqualifiedCout() {
        return unqualifiedCout;
    }

    public void setUnqualifiedCout(Integer unqualifiedCout) {
        this.unqualifiedCout = unqualifiedCout;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }

    @Override
    public String toString() {
        return "TsmcpDailyWork{" +
                "id=" + id +
                ", flag=" + flag +
                ", createTime=" + createTime +
                ", createUserid=" + createUserid +
                ", updateTime=" + updateTime +
                ", updateUserid=" + updateUserid +
                ", scheduleId=" + scheduleId +
                ", equipmentId=" + equipmentId +
                ", equipmentSeq='" + equipmentSeq + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", workingCount=" + workingCount +
                ", qualifiedCount=" + qualifiedCount +
                ", unqualifiedCout=" + unqualifiedCout +
                ", completeFlag=" + completeFlag +
                ", factoryId=" + factoryId +
                ", bak='" + bak + '\'' +
                '}';
    }

    public TsmcpDailyWork() {
    }

    public TsmcpDailyWork(Integer id, Integer flag, Date createTime,
                          Integer createUserid, Date updateTime,
                          Integer updateUserid, Integer scheduleId,
                          Integer equipmentId, String equipmentSeq,
                          Date startTime, Date endTime, Integer workingCount,
                          Integer qualifiedCount, Integer unqualifiedCout,
                          Integer completeFlag, Integer factoryId, String bak)
    {
        this.id = id;
        this.flag = flag;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.updateTime = updateTime;
        this.updateUserid = updateUserid;
        this.scheduleId = scheduleId;
        this.equipmentId = equipmentId;
        this.equipmentSeq = equipmentSeq;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workingCount = workingCount;
        this.qualifiedCount = qualifiedCount;
        this.unqualifiedCout = unqualifiedCout;
        this.completeFlag = completeFlag;
        this.factoryId = factoryId;
        this.bak = bak;
    }
}