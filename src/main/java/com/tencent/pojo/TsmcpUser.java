package com.tencent.pojo;

import java.util.Date;

public class TsmcpUser {
    private Integer id;

    private Integer flag;

    private Date createTime;

    private Integer createUserid;

    private Date updateTime;

    private Integer updateUserid;

    private Integer userStatus;

    private String userName;

    private String userRealName;

    private String userPasswd;

    private String userJobNum;

    private String userPhoneNum;

    private String userEmail;

    private Integer factoryId;

    private String remarks;

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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    public String getUserJobNum() {
        return userJobNum;
    }

    public void setUserJobNum(String userJobNum) {
        this.userJobNum = userJobNum == null ? null : userJobNum.trim();
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum == null ? null : userPhoneNum.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public TsmcpUser(Integer id, Integer flag, Date createTime, Integer createUserid, Date updateTime, Integer updateUserid, Integer userStatus, String userName, String userRealName, String userPasswd, String userJobNum, String userPhoneNum, String userEmail, Integer factoryId, String remarks) {
        this.id = id;
        this.flag = flag;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.updateTime = updateTime;
        this.updateUserid = updateUserid;
        this.userStatus = userStatus;
        this.userName = userName;
        this.userRealName = userRealName;
        this.userPasswd = userPasswd;
        this.userJobNum = userJobNum;
        this.userPhoneNum = userPhoneNum;
        this.userEmail = userEmail;
        this.factoryId = factoryId;
        this.remarks = remarks;
    }

    public TsmcpUser() {
    }

    @Override
    public String toString() {
        return "TsmcpUser{" +
                "id=" + id +
                ", flag=" + flag +
                ", createTime=" + createTime +
                ", createUserid=" + createUserid +
                ", updateTime=" + updateTime +
                ", updateUserid=" + updateUserid +
                ", userStatus=" + userStatus +
                ", userName='" + userName + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userPasswd='" + userPasswd + '\'' +
                ", userJobNum='" + userJobNum + '\'' +
                ", userPhoneNum='" + userPhoneNum + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", factoryId=" + factoryId +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}