package com.artsiomhanchar.lectures.section_5_numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalPractice {
    public static void main(String[] args) {
//        float num1 = 2.15f;
//        float num2 = 1.10f;
//
//        System.out.println(num1 - num2);
//
//        BigDecimal num3 = new BigDecimal("2.15");
//        BigDecimal num4 = new BigDecimal("1.10");
//
//        System.out.println(num3.subtract(num4));

        System.out.println(new BigDecimal(".3145683").add(new BigDecimal("5.321")));
        System.out.println(new BigDecimal(".3145683").subtract(new BigDecimal("5.321")));

//        System.out.println(new BigDecimal(".03828435").divide(new BigDecimal("5.321"))); //Error: Non-terminating decimal expansion; no exact representable decimal result.

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal(".03828435").divide(new BigDecimal("5.321"), mc));

        System.out.println(new BigDecimal(".054798").sqrt(mc));

        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("7").min(new BigDecimal("13")));

        System.out.println(new BigDecimal("-7").abs());

        System.out.println(new BigDecimal("13").remainder(new BigDecimal(8)));
        System.out.println(new BigDecimal("1").remainder(new BigDecimal(2)));
        System.out.println(new BigDecimal("2").remainder(new BigDecimal(2)));
    }
}
