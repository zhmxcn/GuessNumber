package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GuessNumberServiceTest {
    @Test
    public void should_return_result_when_guess_number() {
        GuessNumberGame guessNumberGame = Mockito.mock(GuessNumberGame.class);
        GuessNumberService gameService = new GuessNumberService(guessNumberGame);
        gameService.guess("1 2 3 4");
        Mockito.verify(guessNumberGame, Mockito.times(1)).guess(Mockito.eq("1 2 3 4"));
    }
}