package com.artsiomhanchar.exercises.section_7_testing_code.Task_1;

public class Solution {
    public static String convertString(String text) {
        /**
         * Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
         * method that takes a String input and outputs that same String with every other letter uppercase. For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
         * “aPpLe”. You should end up with two classes - a class with the new method in it, and a
         * class for the unit tests that test your new method. Your test class should contain as many
         * test methods as necessary to test the proper implementation.
         */

        char[] resultLettersArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            resultLettersArray[i] = i % 2 == 0 ? letter : Character.toUpperCase(letter);
        }

        return String.copyValueOf(resultLettersArray);
    }
}
