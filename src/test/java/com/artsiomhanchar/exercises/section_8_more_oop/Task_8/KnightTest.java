package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest extends ChessFigureTest{
    @Test
    public void knightCanMoveNorthEast() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("e7");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

     @Test
     public void knightCanMoveNorthWest() {
         Knight knight = new Knight(COLOR.WHITE);
         knight.setCoordinates(new Coordinates("d5"));

         Coordinates[] validSteps = knight.getValidateSteps();
         Coordinates expectedDestination = new Coordinates("c7");

         assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveEastNorth() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("f6");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveEastSouth() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("f4");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveWestNorth() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("b6");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveWestSouth() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("b4");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveSouthEast() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("e3");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void knightCanMoveSouthWest() {
        Knight knight = new Knight(COLOR.WHITE);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("c3");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }

    @Test
    public void blackKnightCanMoveSouthWest() {
        Knight knight = new Knight(COLOR.BLACK);
        knight.setCoordinates(new Coordinates("d5"));

        Coordinates[] validSteps = knight.getValidateSteps();
        Coordinates expectedDestination = new Coordinates("c7");

        assertTrue(hasStepInArray(validSteps, expectedDestination));
    }
}
