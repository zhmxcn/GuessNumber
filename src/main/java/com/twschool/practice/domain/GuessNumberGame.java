package com.twschool.practice.domain;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    public static final String CORRECT_RESULT = "4A0B";
    private final GameAnswer gameAnswer;


    private GameRecord gameRecord = new GameRecord();
    private GameStatus gameStatus = GameStatus.CONTINUED;
    private int leftTryTimes = MAX_TRY_TIMES;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.gameAnswer = answerGenerator.generateAnswer();
    }

    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        modifyRecord(gameStatus);
        return result;
    }

    private void modifyRecord(GameStatus gameStatus) {
        normalRate(gameStatus);
        timesRate();
    }

    private void timesRate() {
        if (gameRecord.rate%5==0){
            gameRecord.addFiveRate();
        }
        if (gameRecord.rate%3==0){
            gameRecord.addThreeRate();
        }
    }

    private void normalRate(GameStatus gameStatus) {
        if (gameStatus.equals(GameStatus.SUCCEED)){
            gameRecord.addWinRate();
            gameRecord.winTimes++;
        }
        if (gameStatus.equals(GameStatus.FAILED)){
            gameRecord.rate = 0;
        }
    }

    private void modifyStatus(String result) {
        if (CORRECT_RESULT.equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        } else if (leftTryTimes == 0) {
            gameStatus = GameStatus.FAILED;
        }
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
    public GameRecord getGameRecord() {
        return gameRecord;
    }
}
