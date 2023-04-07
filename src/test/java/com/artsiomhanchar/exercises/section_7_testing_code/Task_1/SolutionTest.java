package com.artsiomhanchar.exercises.section_7_testing_code.Task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    /**
     * Use TDD to write tests and a SUT (system under test - the actual implementing class) for a
     * method that takes a String input and outputs that same String with every other letter uppercase. For example, if you enter “cat”, it returns “cAt”. If you enter “apple”, it returns
     * “aPpLe”. You should end up with two classes - a class with the new method in it, and a
     * class for the unit tests that test your new method. Your test class should contain as many
     * test methods as necessary to test the proper implementation.
     */
    @Test
    public void replaceOneLetter() {
        String result = Solution.convertString("q");

        assertEquals("q", result);
    }

    @Test
    public void replaceTwoLetter() {
        String result = Solution.convertString("qq");

        assertEquals("qQ", result);
    }

    @Test
    public void replaceLongText() {
        String result = Solution.convertString("qqqqqqqqqqqqqqqqqqqqqqqqqq");

        assertEquals("qQqQqQqQqQqQqQqQqQqQqQqQqQ", result);
    }

    @Test
    public void replaceCatText() {
        String result = Solution.convertString("cat");

        assertEquals("cAt", result);
    }

    @Test
    public void replaceAppleText() {
        String result = Solution.convertString("apple");

        assertEquals("aPpLe", result);
    }
}
