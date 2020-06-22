package com.twschool.practice.domain;

public class GameRecord {
    public int rate = 0;
    public int winTimes = 0;

    public int addThreeRate() {
        rate+=2;
        return rate;
    }
    public int addFiveRate() {
        rate+=3;
        return rate;
    }
    public int addWinRate() {
        rate+=3;
        return rate;
    }
    public int loseRate() {
        rate-=3;
        return rate;
    }
}
