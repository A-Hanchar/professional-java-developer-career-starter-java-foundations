package com.artsiomhanchar.exercises.section_8_more_oop.Task_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void checkPositionOfA() {
        int position = Solution.getLetterPosition('a');

        assertEquals(1, position);
    }

    @Test
    public void checkPositionOfZ() {
        int position = Solution.getLetterPosition('z');

        assertEquals(26, position);
    }

    @Test
    public void checkPositionOfW() {
        int position = Solution.getLetterPosition('w');

        assertEquals(23, position);
    }

    @Test
    public void checkPositionOfF() {
        int position = Solution.getLetterPosition('f');

        assertEquals(6, position);
    }

    @Test
    public void checkPositionOfC() {
        int position = Solution.getLetterPosition('c');

        assertEquals(3, position);
    }

    @Test
    public void checkPositionOfH() {
        int position = Solution.getLetterPosition('h');

        assertEquals(8, position);
    }
}
