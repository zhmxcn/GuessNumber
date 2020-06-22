package com.twschool.practice.domain;


import org.springframework.stereotype.Repository;

@Repository
public class GameRepository {
    private GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());

    public GuessNumberGame create(){
        guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        return guessNumberGame;
    }

    public GuessNumberGame find(){
        return guessNumberGame;
    }

}