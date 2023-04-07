package com.artsiomhanchar.lectures.section_5_numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalPractice2 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(3.141592);
        BigDecimal num2 = new BigDecimal(3.141592f);

        short myShort = 12345;
        BigDecimal num3 = new BigDecimal(myShort);

        byte myByte = 127;
        BigDecimal num4 = new BigDecimal(myByte);

        System.out.println(num3.byteValue());
        System.out.println(num4.doubleValue());
        System.out.println(num1.toString());

        BigInteger myInteger = new BigInteger("1234563829382938");

//        Under the hood, when we create BigDecimal, value convert in BigInteger, moving float sign (dot .) in the end
//        new BigDecimal("3.141592") => new BigInteger("3141592")
    }
}
