package com.artsiomhanchar.lectures.section_6_control_flow;

import java.util.Random;

public class DoWhileLoops {
    public static final int MAX_ALLOWED_TRIED = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String guessedNumberString = null;

        int wrongGuessCount = 0;

        do {
            guessedNumberString = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");

            if (guessedNumberString.matches("(-)?\\d{1,2}")) {
                int guessedNumber = Integer.parseInt(guessedNumberString);
                wrongGuessCount++;

                if (guessedNumber == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";

                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuessCount, tryText);

                    return;
                } else {
                    System.out.printf("You didn't get it!%n");
                }
            }
        } while (!"q".equals(guessedNumberString) && wrongGuessCount < MAX_ALLOWED_TRIED);

        if (wrongGuessCount >= MAX_ALLOWED_TRIED) {
            System.out.printf("You've had %d incorrect guesses. The random number is %d. Ending program now. %n ", wrongGuessCount, randomNum);
        }
    }
}
