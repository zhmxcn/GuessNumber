package com.twschool.practice.service;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GameRepository;
import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class GuessNumberService {

    @Autowired
    private GameRepository gameRepository;


        public String guess(String userAnswer){
            GuessNumberGame guessNumberGame = gameRepository.find();
            return guessNumberGame.guess(userAnswer);
        }

}