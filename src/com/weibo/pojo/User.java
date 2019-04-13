package com.weibo.pojo;

public class User {
    int userId;
    String userName;
    String userPassword;
    int fans;
    int carePeople;
    int microblog;
    String chatHead;
    String aphorism;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getCarePeople() {
        return carePeople;
    }

    public void setCarePeople(int carePeople) {
        this.carePeople = carePeople;
    }

    public int getMicroblog() {
        return microblog;
    }

    public void setMicroblog(int microblog) {
        this.microblog = microblog;
    }

    public String getChatHead() {
        return chatHead;
    }

    public void setChatHead(String chatHead) {
        this.chatHead = chatHead;
    }

    public String getAphorism() {
        return aphorism;
    }

    public void setAphorism(String aphorism) {
        this.aphorism = aphorism;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", fans=" + fans +
                ", carePeople=" + carePeople +
                ", microblog=" + microblog +
                ", chatHead='" + chatHead + '\'' +
                ", aphorism='" + aphorism + '\'' +
                '}';
    }
}