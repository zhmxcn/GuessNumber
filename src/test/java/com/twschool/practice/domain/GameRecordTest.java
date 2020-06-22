package com.twschool.practice.domain;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameRecordTest {
    @Test
    public void should_return_3_given_0_when_addThreeRate() {
        //given
        GameRecord gameRecord = new GameRecord();
        //when
        int rate = gameRecord.addThreeRate();
        //then
        assertEquals(2,rate);
    }

}