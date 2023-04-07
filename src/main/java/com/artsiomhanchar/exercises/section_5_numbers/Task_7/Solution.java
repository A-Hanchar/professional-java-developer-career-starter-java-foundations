package com.artsiomhanchar.exercises.section_5_numbers.Task_7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

public class Solution {
    /**
     * Write a function that takes a String input of “$12,345.83” and prints out that value divided
     * by 32.19. It should return $383.53.
     */

    public static void main(String[] args) throws ParseException {
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        BigDecimal divider = new BigDecimal("32.19");

        String input = "$12,345.83";

        BigDecimal money = new BigDecimal(
                moneyFormatter
                        .parse(input)
                        .toString()
        ).divide(divider, RoundingMode.HALF_UP);

        System.out.println(moneyFormatter.format(money));
    }
}
