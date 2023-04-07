package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PawnTest extends ChessFigureTest {
    @Test
    public void pawnCanMoveOneForward() {
        Pawn pawn = new Pawn(COLOR.WHITE);
        pawn.setCoordinates(new Coordinates("a2"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("a3");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void pawnCanMoveTwoForwardOnFirstMove() {
        Pawn pawn = new Pawn(COLOR.WHITE);
        pawn.setCoordinates(new Coordinates("a2"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("a4");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void canNotMoveTwoAfterFirstMove() {
        Pawn pawn = new Pawn(COLOR.WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        pawn.setCoordinates(new Coordinates("a3"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("a5");

        assertFalse(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void canMoveOneDiagonallyRight() {
        Pawn pawn = new Pawn(COLOR.WHITE);
        pawn.setCoordinates(new Coordinates("a2"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("b3");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void canMoveOneDiagonallyLeft() {
        Pawn pawn = new Pawn(COLOR.WHITE);
        pawn.setCoordinates(new Coordinates("b2"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("a3");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void blackPawnCanMoveOneForward() {
        Pawn pawn = new Pawn(COLOR.BLACK);
        pawn.setCoordinates(new Coordinates("a7"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("a6");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void blackPawnCanMoveTwoForwardOnFirstMove() {
        Pawn pawn = new Pawn(COLOR.BLACK);
        pawn.setCoordinates(new Coordinates("b7"));

        Coordinates[] validSteps = pawn.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("b6");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }
}

