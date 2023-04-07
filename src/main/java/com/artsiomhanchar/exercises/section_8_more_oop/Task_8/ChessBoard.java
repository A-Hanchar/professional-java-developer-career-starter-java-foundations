package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import java.util.ArrayList;
import java.util.Arrays;

public class ChessBoard {
    private final int BOARD_SIZE = 8;

    private ChessFigure[][] board = new ChessFigure[BOARD_SIZE][BOARD_SIZE];
    private int countOfWhiteFigures = 0;
    private int countOfBlackFigures = 0;

    public void addFigure(ChessFigure figure, String coordinates) {
        Coordinates boardCoordinates = Coordinates.getCoordinatesFromText(coordinates);

        int plusMinusOne = board[boardCoordinates.x][boardCoordinates.y] == null ? 1 : -1;

        if (figure.color == COLOR.WHITE) {
            countOfWhiteFigures += plusMinusOne;
        }

        if (figure.color == COLOR.BLACK) {
            countOfBlackFigures += plusMinusOne;
        }

        board[boardCoordinates.x][boardCoordinates.y] = figure;
        figure.setCurrentCoordinates(boardCoordinates);
    }

    public ChessFigure getFigureByCoordinates(String coordinates) {
        Coordinates boardCoordinates = Coordinates.getCoordinatesFromText(coordinates);

        return board[boardCoordinates.x][boardCoordinates.y];
    }

    public void moveFigure(ChessFigure figure, String newCoordinates) {
        Coordinates[] availableCoordinates = getAvailableCoordinates(figure);

        Coordinates newCoordinatesAsXY = Coordinates.getCoordinatesFromText(newCoordinates);

        if (canMoveFigure(availableCoordinates, figure, newCoordinatesAsXY)) {
            Coordinates figureCurrentCoordinates = figure.getCurrentCoordinates();

            board[figureCurrentCoordinates.x][figureCurrentCoordinates.y] = null;

            addFigure(figure, newCoordinates);
        }
    }

    private Coordinates[] getAvailableCoordinates(ChessFigure figure) {
        Coordinates[] validateSteps = figure.getValidateSteps();

        ArrayList<Coordinates> filteredCoordinates = new ArrayList();

        for (Coordinates coordinate: validateSteps) {
            int x = coordinate.x;
            int y = coordinate.y;

            if ((x >= 0 && x < BOARD_SIZE) && (y >= 0 && y < BOARD_SIZE)) {
                filteredCoordinates.add(coordinate);
            }
        }

        return filteredCoordinates.toArray(new Coordinates[filteredCoordinates.size()]);
    }

    protected boolean canMoveFigure(Coordinates[] availableCoordinates, ChessFigure figure, Coordinates expectedMove) {
        ChessFigure checkedCell = board[expectedMove.x][expectedMove.y];

        if (checkedCell != null && checkedCell.color == figure.color) {
            return false;
        }

        for (Coordinates step: availableCoordinates) {
            if(step.x == expectedMove.x && step.y == expectedMove.y) {
                return true;
            }
        }

        return false;
    }

    public int getCountOfWhiteFigures() {
        return countOfWhiteFigures;
    }

    public int getCountOfBlackFigures() {
        return countOfBlackFigures;
    }
}
