package com.artsiomhanchar.lectures.section_7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);

        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);

        assertEquals(2, sum);
    }

    @Test
    public void canAddMinusTenPlusSeven() {
        int sum = calc.add(-10, 7);

        assertEquals(-3, sum);
    }

    @Test
    public void canAddMinusTenPlusMinusSeven() {
        int sum = calc.add(-10, -7);

        assertEquals(-17, sum);
    }

    @Test
    @Disabled
    public void canAddMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        System.out.println(sum); //2147483647
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, ".06", 1);

        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityPractice2() {
        String answer = calc.calcAnnuity("1200", 10, ".08", 4);

        assertEquals("$72,482.38", answer);
    }
}
