package com.artsiomhanchar.lectures.section_8_more_oop.blackjack;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    Rank(int value) {
        this.value = value;
    }

    //        Rank KING = new Rank("KING");
//        Rank QUEEN = new Rank("QUEEN");
//        Rank JACK = new Rank("JACK");

    public int getValue() {
        return value;
//        return switch (this) {
//            case KING, QUEEN, JACK -> 10;
//            default -> ordinal() + 1;
//        };
    }
}
