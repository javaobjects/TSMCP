package com.tencent.utill;

public class RcDetailRequest {
    //接收参数对象
//    draw 、start、length 、search
//    draw  这个不用理解，就是绘制表格，当然这个数据查询的时候你会发现
//    它传给后台是多少，后台要返回多少
//    start 开始的数据，不是页码，而是数据个数，但是后台要的是页面，那你需要找到所有的数据，除以每页
//    length 每页的长度
//    serch 查询的内容

    private int draw;
    private int start;
    private int length;
    private String search;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}

