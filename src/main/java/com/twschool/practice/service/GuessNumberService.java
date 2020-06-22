package com.twschool.practice.service;

import com.twschool.practice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GuessNumberService {

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private UserRepository userRepository;

    public String guess(String userAnswer) {
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(userAnswer);
    }

    public String getRate() {
        GuessNumberGame guessNumberGame = gameRepository.find();
        return String.valueOf(guessNumberGame.getGameRecord().rate);
    }

    public UserInfo login(String userId){

        return userRepository.find(userId);
    }

    public String getStatus() {

        return gameRepository.find().getStatus().toString();
    }
}