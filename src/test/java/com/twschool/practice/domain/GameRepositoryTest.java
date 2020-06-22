package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class GameRepositoryTest {
    @Test
    public void should_return_same_when_guess_game_create_and_find(){
        //given
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        GuessNumberGame guessNumberGame = gameRepository.create();

        //when
        GuessNumberGame guessNumberGame1 = gameRepository.find();
        //then
        Assert.assertEquals(guessNumberGame,guessNumberGame1);
    }
}