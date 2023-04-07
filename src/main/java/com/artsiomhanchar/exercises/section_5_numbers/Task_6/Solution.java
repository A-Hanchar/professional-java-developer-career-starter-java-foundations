package com.artsiomhanchar.exercises.section_5_numbers.Task_6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class Solution {
    /**
     * . Write a function that takes a String like “149.32” and formats it as money for wherever you
     * live. So, if you live in the United States, it would return “$149.32”, Korea = ₩149, France/
     * EU = 149,32 €, etc.
     */

    public static void main(String[] args) {
        String moneyBalance = "149.32";

        BigInteger money = new BigDecimal(moneyBalance).toBigInteger();

        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

        System.out.println(moneyFormatter.format(money));
    }
}
