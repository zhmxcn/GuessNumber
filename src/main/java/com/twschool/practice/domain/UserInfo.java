package com.twschool.practice.domain;

public class UserInfo {
    private String userId;
    private GameRecord record = new GameRecord();

    public UserInfo(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GameRecord getRecord() {
        return record;
    }

    public void setRecord(GameRecord record) {
        this.record = record;
    }
}
