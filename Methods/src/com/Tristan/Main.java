package com.Tristan;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score, levelCompleted, bonus);
        System.out.println(highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Trit", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("not trit", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("someone else", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("that guy", highScorePosition);
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " is in " + position + " position");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >=1000) {
            return 1;
        } else if (score >=500 && score <1000) {
            return 2;
        } else if (score >=100 && score <500) {
            return 3;
        } else {
            return 4;
        }
    }
}
