package com.tencent.utill;

import java.util.HashMap;
import java.util.Map;

public class RcDetailResponse {
    //     返回对象
    //    draw  、 recordsTotal、recordsFiltered 、error、 data
    //    recordsTotal 总共多少，一般是数据库有多少，就写多少
    //    recordsFiltered  过滤后的数据，我这里和recordsTotal是一样的
    //    error  可以选填
    //    data  传给datatable的数据，当然名字可以换，换名字之后，要指定数据源
    //    比如换成  dataJson 那么要添加一个，下面有详细使用
    //	 "dataSrc": "dataJson",
    //    或者
    //	   "dataSrc": "dataMap.list",

    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private String error;
    private Map<String,Object> dataMap = new HashMap<>();

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
