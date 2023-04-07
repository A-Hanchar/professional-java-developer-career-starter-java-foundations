package com.artsiomhanchar.exercises.section_8_more_oop.Task_7;

public class Solution {
    /**
     * If you modeled a chess board in Java using a two-dimensional array, how could you
     * convert chess notation, or coordinate notation of chess, to an element in that twodimensional array?
     * For example, in the chess board image below, square a8 might map to array[0][0], and h1 might map to array[7][7].
     * Make a method that takes an input String of a chess coordinate and returns array coordinates.
     * This exercise simply builds on the previous two. Use the following test data:
     *
     * Input      Output
     * a8         0,0
     * h1         7,7
     * g5         6,3
     * d4         3,4
     */

    public static void main(String[] args) {
        System.out.println(getBoardCoordinates("a8"));
        System.out.println(getBoardCoordinates("h1"));
        System.out.println(getBoardCoordinates("g5"));
        System.out.println(getBoardCoordinates("d4"));
    }

    public static String getBoardCoordinates(String chessCoordinate) {
        int START_CODE = 97; //  code of letter a is 97

        char symbol = chessCoordinate.charAt(0);
        int num = Integer.parseInt(Character.toString(chessCoordinate.charAt(1)));

        int x = (int) symbol - START_CODE;
        int y = 8 - num;

        return String.format("%d,%d", x, y);
    }
}