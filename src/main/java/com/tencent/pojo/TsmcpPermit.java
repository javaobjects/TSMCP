package com.tencent.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class TsmcpPermit implements Serializable {

    private Integer id;

    private Integer flag;

    private Integer status;

    private Integer parentId;

    private String permitName;

    private String permitDesc;

    private String permitPath;

    private List permitPaths;

    public TsmcpPermit(Integer id, Integer flag, Integer status, Integer parentId, String permitName, String permitDesc, String permitPath) {
        this.id = id;
        this.flag = flag;
        this.status = status;
        this.parentId = parentId;
        this.permitName = permitName;
        this.permitDesc = permitDesc;
        this.permitPath = permitPath;
    }

    @Override
    public String toString() {
        return "TsmcpPermit{" +
                "id=" + id +
                ", flag=" + flag +
                ", status=" + status +
                ", parentId=" + parentId +
                ", permitName='" + permitName + '\'' +
                ", permitDesc='" + permitDesc + '\'' +
                ", permitPath='" + permitPath + '\'' +
                ", permitPaths=" + permitPaths +
                '}';
    }

    //权限关系用","分隔开
    public List getPermitPaths() {
        return Arrays.asList(this.permitPath.trim().split(","));
    }

    public void setPermitPaths(List permitPaths) {
        this.permitPaths = permitPaths;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPermitName() {
        return permitName;
    }

    public void setPermitName(String permitName) {
        this.permitName = permitName == null ? null : permitName.trim();
    }

    public String getPermitDesc() {
        return permitDesc;
    }

    public void setPermitDesc(String permitDesc) {
        this.permitDesc = permitDesc == null ? null : permitDesc.trim();
    }

    public String getPermitPath() {
        return permitPath;
    }

    public void setPermitPath(String permitPath) {
        this.permitPath = permitPath == null ? null : permitPath.trim();
    }
}