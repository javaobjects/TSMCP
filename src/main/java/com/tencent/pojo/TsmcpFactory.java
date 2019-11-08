package com.tencent.pojo;

import java.util.Date;

public class TsmcpFactory {
    private Integer id;

    private Integer flag;

    private Date createTime;

    private Integer createUserid;

    private Date updateTime;

    private Integer updateUserid;

    private String bak;

    private String factoryName;

    private String factoryImgUrl;

    private String factoryAddr;

    private String factoryUrl;

    private Integer factoryWorker;

    private Integer factoryStatus;

    public Integer getId() {
        return id;
    }

    public Integer getFlag() {
        return flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Integer getUpdateUserid() {
        return updateUserid;
    }

    public String getBak() {
        return bak;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public String getFactoryImgUrl() {
        return factoryImgUrl;
    }

    public String getFactoryAddr() {
        return factoryAddr;
    }

    public String getFactoryUrl() {
        return factoryUrl;
    }

    public Integer getFactoryWorker() {
        return factoryWorker;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setFactoryImgUrl(String factoryImgUrl) {
        this.factoryImgUrl = factoryImgUrl;
    }

    public void setFactoryAddr(String factoryAddr) {
        this.factoryAddr = factoryAddr;
    }

    public void setFactoryUrl(String factoryUrl) {
        this.factoryUrl = factoryUrl;
    }

    public void setFactoryWorker(Integer factoryWorker) {
        this.factoryWorker = factoryWorker;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }


    public TsmcpFactory(Integer id, Integer flag, Date createTime,
                        Integer createUserid, Date updateTime,
                        Integer updateUserid, String bak,
                        String factoryName, String factoryImgUrl,
                        String factoryAddr, String factoryUrl,
                        Integer factoryWorker, Integer factoryStatus) {
        this.id = id;
        this.flag = flag;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.updateTime = updateTime;
        this.updateUserid = updateUserid;
        this.bak = bak;
        this.factoryName = factoryName;
        this.factoryImgUrl = factoryImgUrl;
        this.factoryAddr = factoryAddr;
        this.factoryUrl = factoryUrl;
        this.factoryWorker = factoryWorker;
        this.factoryStatus = factoryStatus;
    }

    public TsmcpFactory() {
    }

    @Override
    public String toString() {
        return "TsmcpFactory{" +
                "id=" + id +
                ", flag=" + flag +
                ", createTime=" + createTime +
                ", createUserid=" + createUserid +
                ", updateTime=" + updateTime +
                ", updateUserid=" + updateUserid +
                ", bak='" + bak + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", factoryImgUrl='" + factoryImgUrl + '\'' +
                ", factoryAddr='" + factoryAddr + '\'' +
                ", factoryUrl='" + factoryUrl + '\'' +
                ", factoryWorker=" + factoryWorker +
                ", factoryStatus=" + factoryStatus +
                '}';
    }
}