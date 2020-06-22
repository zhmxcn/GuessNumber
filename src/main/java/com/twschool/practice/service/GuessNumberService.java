package com.twschool.practice.service;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;

public class GuessNumberService {

    private static GuessNumberGame guessNumberGame;

    public GuessNumberService(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public GuessNumberService() {

    }

    public String guess(String number) {
        if (!guessNumberGame.getStatus().equals(GameStatus.CONTINUED)){
            guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        }
        return guessNumberGame.guess(number);
    }
}
