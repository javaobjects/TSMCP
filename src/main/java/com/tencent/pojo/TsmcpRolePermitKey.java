package com.tencent.pojo;

public class TsmcpRolePermitKey {
    private Integer roleId;

    private Integer userId;

    public TsmcpRolePermitKey() {
    }

    public TsmcpRolePermitKey(Integer roleId, Integer userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TsmcpRolePermitKey{" +
                "roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}