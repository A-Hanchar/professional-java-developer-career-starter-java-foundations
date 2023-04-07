package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

public final class Coordinates {
    protected int x;
    protected int y;

    public Coordinates(String coordinates) {
        int x = getXFromText(coordinates);
        int y = getYFromText(coordinates);

        this.x = x;
        this.y = y;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static int getLetterPosition(char letter) {
        int positionOfALetter = (int) 'a';

        return (int) letter - positionOfALetter;
    }

    private int getXFromText(String coordinates) {
        char xChar = Character.valueOf(coordinates.charAt(0));
        int x = getLetterPosition(xChar);

        return x;
    }

    private int getYFromText(String coordinates) {
        int y = Integer.parseInt(Character.toString(coordinates.charAt(1)));

        return y;
    }

    public static Coordinates getCoordinatesFromText(String coordinates) {
        char xChar = Character.valueOf(coordinates.charAt(0));
        int x = getLetterPosition(xChar);

        int y = Integer.parseInt(Character.toString(coordinates.charAt(1)));

        return new Coordinates(x, y - 1);
    }
}
