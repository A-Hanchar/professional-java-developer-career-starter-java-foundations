package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ChessBoardTest {
    @Test
    public void canAddPawn() {
        String a2 = "a2";

        ChessBoard board = new ChessBoard();

        Pawn pawn = new Pawn(COLOR.WHITE);
        board.addFigure(pawn, a2);

        Pawn foundPawn = (Pawn) board.getFigureByCoordinates(a2);
        assertEquals(pawn, foundPawn);
    }

    @Test
    public void canAddKnight() {
        String c1 = "c1";

        ChessBoard board = new ChessBoard();

        Knight knight = new Knight(COLOR.BLACK);
        board.addFigure(knight, c1);

        Knight foundPawn = (Knight) board.getFigureByCoordinates(c1);
        assertEquals(knight, foundPawn);
    }

    @Test
    public void canMoveC1KnightToD3() {
        String c1 = "c1";
        String d3 = "d3";

        ChessBoard board = new ChessBoard();

        Knight knight = new Knight(COLOR.WHITE);
        board.addFigure(knight, c1);

        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should initially be @ c1");

        board.moveFigure(knight, d3);

        assertNull(board.getFigureByCoordinates(c1), "After move, Knight should no longer be @ c1");
        assertEquals(knight, board.getFigureByCoordinates(d3), "Knight should now be @ d3");
    }

    @Test()
    public void canNotMoveC1KnightToInvalidSquare() {
        String c1 = "c1";
        String d4 = "d4";

        ChessBoard board = new ChessBoard();

        Knight knight = new Knight(COLOR.WHITE);
        board.addFigure(knight, c1);

        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should initially be @ c1");

        board.moveFigure(knight, d4);

        assertNull(board.getFigureByCoordinates(d4), "After move, Knight should not be @ d4");
        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should still be @ c1");
    }

    @Test
    public void canNotMoveC1KnightToFriendlyOccupiedSquare() {
        String c1 = "c1";
        String d3 = "d3";

        ChessBoard board = new ChessBoard();

        Pawn pawn = new Pawn(COLOR.WHITE);
        board.addFigure(pawn, d3);

        Knight knight = new Knight(COLOR.WHITE);
        board.addFigure(knight, c1);

        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should initially be @ c1");

        board.moveFigure(knight, d3);

        assertEquals(pawn, board.getFigureByCoordinates(d3), "After move attempt, pawn should still be @ d3");
        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should still be @ c1");
    }

    @Test
    public void canMoveC1KnightToEnemyOccupiedSquare() {
        String c1 = "c1";
        String d3 = "d3";

        ChessBoard board = new ChessBoard();

        Pawn pawn = new Pawn(COLOR.BLACK);
        board.addFigure(pawn, d3);

        assertEquals(1, board.getCountOfBlackFigures());

        Knight knight = new Knight(COLOR.WHITE);
        board.addFigure(knight, c1);

        assertEquals(1, board.getCountOfWhiteFigures());

        assertEquals(knight, board.getFigureByCoordinates(c1), "Knight should initially be @ c1");

        board.moveFigure(knight, d3);

        assertEquals(knight, board.getFigureByCoordinates(d3), "Knight should now be @ d3");

        assertEquals(1, board.getCountOfBlackFigures());
        assertEquals(0, board.getCountOfWhiteFigures());
    }
}
