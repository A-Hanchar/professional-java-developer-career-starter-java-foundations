package com.artsiomhanchar.lectures.section_6_control_flow;

import java.util.Random;

public class WhileLoops {
//    public static void main(String[] args) {
//        int randomNum = new Random().nextInt(10) + 1;
//
//        while (true) {
//            String guessedNumberString = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
//            int guessedNumber = Integer.parseInt(guessedNumberString);
//
//            if (guessedNumber == randomNum) {
//                System.out.printf("The random number was %d. You got it!%n", randomNum);
//
//                return;
////                break;
//            } else {
//                System.out.printf("You didn't get it!%n");
//            }
//        }
//    }

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String guessedNumberString = null;

        while (!"q".equals(guessedNumberString)) {
            guessedNumberString = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");

            if (guessedNumberString.matches("(-)?\\d{1,2}")) {
                int guessedNumber = Integer.parseInt(guessedNumberString);

                if (guessedNumber == randomNum) {
                    System.out.printf("The random number was %d. You got it!%n", randomNum);

                    return;
                } else {
                    System.out.printf("You didn't get it!%n");
                }
            }
        }
    }
}
