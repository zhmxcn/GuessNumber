package com.twschool.practice.domain;


import org.springframework.stereotype.Repository;

@Repository
public class GameRepository {
    private GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());

    public GuessNumberGame create() {
        return null;
    }

    public GuessNumberGame find() {
        return null;
    }

}