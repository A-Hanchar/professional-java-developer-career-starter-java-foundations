package com.artsiomhanchar.lectures.section_8_more_oop.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {
    @Test
    void heartPrintHeart() {
        assertEquals("\u2665", Suit.HEARTS.toString());
    }
}