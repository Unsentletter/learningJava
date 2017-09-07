package com.Tristan;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Trit", 50);
        System.out.println(newScore);

        calculateScore(500);
        calculateScore();

        calculateFeetAndInchesToCentimeters(6,0);
        calculateFeetAndInchesToCentimeters(12);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("UnnamedPlayer scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player scored points");
        return 0;
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || ((inches < 0) || (inches > 12))) {
            return -1;
        }
        double totalInches = (feet * 12) + inches;
        double centimeters = totalInches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " remaining inches");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
