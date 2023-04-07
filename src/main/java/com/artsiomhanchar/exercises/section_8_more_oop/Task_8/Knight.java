package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import java.util.LinkedList;

public class Knight extends ChessFigure {
    public Knight(COLOR color) {
        super(color);
    }

    @Override
    public Coordinates[] getValidateSteps() {
        int currentX = this.getCurrentCoordinates().x;
        int currentY = this.getCurrentCoordinates().y;

        LinkedList<Coordinates> validCoordinatesList = new LinkedList<>();

        Coordinates northEast = new Coordinates(currentX + 1, currentY + 2);
        Coordinates northWest = new Coordinates(currentX - 1, currentY + 2);

        Coordinates eastNorth = new Coordinates(currentX + 2, currentY + 1);
        Coordinates eastSouth = new Coordinates(currentX + 2, currentY - 1);

        Coordinates southEast = new Coordinates(currentX + 1, currentY - 2);
        Coordinates southWest = new Coordinates(currentX - 1, currentY - 2);

        Coordinates westSouth = new Coordinates(currentX - 2, currentY - 1);
        Coordinates westNorth = new Coordinates(currentX - 2, currentY + 1);

        validCoordinatesList.push(northEast);
        validCoordinatesList.push(northWest);
        validCoordinatesList.push(eastNorth);
        validCoordinatesList.push(eastSouth);
        validCoordinatesList.push(southEast);
        validCoordinatesList.push(southWest);
        validCoordinatesList.push(westSouth);
        validCoordinatesList.push(westNorth);

        return validCoordinatesList.toArray(new Coordinates[validCoordinatesList.size()]);
    }
}
