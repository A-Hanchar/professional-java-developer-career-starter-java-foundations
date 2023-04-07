package com.artsiomhanchar.lectures.section_7_testing_code;

import java.util.Random;

public class GuessingGame {
    private final int randomNumber = generateRandomNumber();
    private int counter = 0;

    private int generateRandomNumber() {
        int randomNum = new Random().nextInt(10) + 1;

        return randomNum;
    }

    public String guess(int guessedNumber) {
        counter++;

        String tryText = counter == 1 ? "try" : "tries";

        String finishGameMessage = null;

        if(counter == 4 && guessedNumber != randomNumber) {
            finishGameMessage = String.format("You didn't get it and you've had %d %s. Game over.", counter, tryText);
        } else if( counter > 4) {
            finishGameMessage = "Sorry, you are limited to only 4 tries. Your game is over.";
        } else {
            String winningMessage = String.format("You got it in %d %s", counter, tryText);
            String tooHighLowText = null;

            if(guessedNumber < randomNumber) {
                tooHighLowText = "- you're too low";
            } else if (guessedNumber > randomNumber) {
                tooHighLowText = "- you're too high";
            } else {
                tooHighLowText = "";
            }

            String looseText = String.format("You didn't get it %s", tooHighLowText).trim();

            finishGameMessage = guessedNumber == randomNumber ? winningMessage : looseText;
        }

        return finishGameMessage;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();

        boolean loopShouldContinue;

        do {
            String input = System.console().readLine("Enter a number: ");

            if ("q".equals(input)) {
                return;
            }

            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);

            if (output.contains("You got it") || output.contains("over")) {
                loopShouldContinue = false;
            } else {
                loopShouldContinue = true;
            }
        } while (loopShouldContinue);


    }
}
