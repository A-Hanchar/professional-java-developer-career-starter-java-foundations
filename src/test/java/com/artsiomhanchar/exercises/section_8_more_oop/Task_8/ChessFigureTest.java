package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

public class ChessFigureTest {
    protected boolean hasStepInArray(Coordinates[] steps, Coordinates expectedMove) {
        for (Coordinates step: steps) {
            if(step.x == expectedMove.x && step.y == expectedMove.y) {
                return true;
            }
        }

        return false;
    }
}
