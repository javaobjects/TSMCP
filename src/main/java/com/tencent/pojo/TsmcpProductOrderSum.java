package com.tencent.pojo;

public class TsmcpProductOrderSum {
    private int orderStatus;
    private int orderStatusSum;

    public TsmcpProductOrderSum() {
    }

    public TsmcpProductOrderSum(int orderStatus, int orderStatusSum) {
        this.orderStatus = orderStatus;
        this.orderStatusSum = orderStatusSum;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderStatusSum() {
        return orderStatusSum;
    }

    public void setOrderStatusSum(int orderStatusSum) {
        this.orderStatusSum = orderStatusSum;
    }

    @Override
    public String toString() {
        return "TsmcpProductOrderSum{" +
                "orderStatus=" + orderStatus +
                ", orderStatusSum=" + orderStatusSum +
                '}';
    }
}
