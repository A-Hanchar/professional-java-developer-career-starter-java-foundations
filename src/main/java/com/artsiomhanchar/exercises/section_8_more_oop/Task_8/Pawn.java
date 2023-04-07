package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import java.util.LinkedList;

public class Pawn extends ChessFigure {
    private boolean wasMoved = false;

    public Pawn(COLOR color) {
        super(color);
    }

    @Override
    public Coordinates[] getValidateSteps() {
        int currentX = this.getCurrentCoordinates().x;
        int currentY = this.getCurrentCoordinates().y;

        int way = color == COLOR.WHITE ? 1 : -1;

        LinkedList<Coordinates> validCoordinatesList = new LinkedList<>();

        int nextPrevY = currentY + (1 * way);

        Coordinates nextOneStep = new Coordinates(currentX, nextPrevY);
        validCoordinatesList.push(nextOneStep);

        if (!wasMoved) {
            Coordinates nextTwoStep = new Coordinates(currentX, currentY + 2);

            validCoordinatesList.push(nextTwoStep);
        }

        Coordinates nextDiagonalLeft = new Coordinates(currentX - 1, nextPrevY);
        Coordinates nextDiagonalRight = new Coordinates(currentX + 1, nextPrevY);

        validCoordinatesList.push(nextDiagonalLeft);
        validCoordinatesList.push(nextDiagonalRight);

        return validCoordinatesList.toArray(new Coordinates[validCoordinatesList.size()]);
    }

    @Override
    protected void setCoordinates(Coordinates newCoordinates) {
        if (this.currentCoordinates != null) {
            wasMoved = true;
        }
        super.setCoordinates(newCoordinates);
    }
}
