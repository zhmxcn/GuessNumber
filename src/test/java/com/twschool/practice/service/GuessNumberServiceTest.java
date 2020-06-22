package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import org.junit.Test;
import org.mockito.Mockito;

public class GuessNumberServiceTest {
    @Test
    public void should_return_result_when_guess_number() {
        GuessNumberService gameService = Mockito.mock(GuessNumberService.class);
        gameService.guess("1 2 3 4");
        Mockito.verify(gameService, Mockito.times(1)).guess(Mockito.anyString());
    }
}