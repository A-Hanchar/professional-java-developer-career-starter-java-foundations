package com.artsiomhanchar.lectures.section_7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWaySituation() {
        int randomNumber = game.getRandomNumber();
        String message = game.guess(randomNumber);

        assertEquals("You got it in 1 try", message);
    }

    @Test
    public void testOneWrongNegativeGuessSituation() {
        String message = game.guess(-5);

        assertEquals("You didn't get it - you're too low", message);
    }

    @Test
    public void testOneWrongPositiveGuessSituation() {
        int randomNumber = game.getRandomNumber();
        String message = game.guess(randomNumber + 1);

        assertEquals("You didn't get it - you're too high", message);
    }

    @RepeatedTest(10)
    public void testRandomNumberGeneration() {
        int[] randomNumbers = new int[10];

        for (int i = 0; i < 100; i++) {
            GuessingGame game = new GuessingGame();

            int randomNumber = game.getRandomNumber();
//            int randomNumber = this.game.getRandomNumber(); // from the all object => game from top Scope
            randomNumbers[randomNumber - 1] = 1;
        }

        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        }

        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);

        assertEquals("You didn't get it and you've had 4 tries. Game over.", message);
    }

    @Test
    public void testTenWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);

        assertEquals("Sorry, you are limited to only 4 tries. Your game is over.", message);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);

        int correctAnswer = game.getRandomNumber();

        String message = game.guess(correctAnswer);

        assertEquals("You got it in 4 tries", message);
    }

    @Test
    public void testTwoWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);

        int correctAnswer = game.getRandomNumber();

        String message = game.guess(correctAnswer);

        assertTrue(message.contains(" 3 "));
        assertEquals("You got it in 3 tries", message);
    }
}
