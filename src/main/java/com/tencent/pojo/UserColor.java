package com.tencent.pojo;

public class UserColor {

    private int userId;

    private String userColor;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }

    public UserColor(int userId, String userColor) {
        this.userId = userId;
        this.userColor = userColor;
    }

    public UserColor() {
    }

    @Override
    public String toString() {
        return "UserColor{" +
                "userId=" + userId +
                ", userColor='" + userColor + '\'' +
                '}';
    }
}
