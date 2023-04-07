package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

public abstract class ChessFigure {
    protected COLOR color;
    protected Coordinates currentCoordinates;

    public ChessFigure(COLOR color) {
        this.color = color;
    }

    public Coordinates getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void setCurrentCoordinates(Coordinates currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    protected void setCoordinates(Coordinates newCoordinates) {
        this.currentCoordinates = newCoordinates;
    }

    abstract Coordinates[] getValidateSteps();
}
