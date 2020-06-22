package com.twschool.practice.service;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;
import org.springframework.stereotype.Service;

public class GuessNumberService {

    private static GuessNumberGame guessNumberGame;


        public String guess(String userAnswer){
            GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());
            return guessNumberGame.guess(userAnswer);
        }

}