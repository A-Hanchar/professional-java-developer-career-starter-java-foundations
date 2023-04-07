package com.artsiomhanchar.lectures.section_7_testing_code;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public String calcAnnuity(String R, int t, String r, int n) {
        BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n)); // r / n
        BigDecimal b = a.add(BigDecimal.ONE); // 1 + (r / n)
        Integer c = n * t; // n * t
        BigDecimal d = b.pow(c); // (1 + (r / n))^(n*t)
        BigDecimal e = d.subtract(BigDecimal.ONE); // [ (1 + (r / n))^(n*t) ] - 1

        BigDecimal f = e.divide(a); // [ [ (1 + (r / n))^(n*t) ] - 1 ] / (r / n)

        BigDecimal result = f.multiply(new BigDecimal(R)); // R * [ [ (1 + (r / n))^(n*t) ] - 1 ] / (r / n)

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

        return currencyInstance.format(result);
    }
}
