package com.artsiomhanchar.lectures.section_5_numbers;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        System.out.println("----------------");

        System.out.println(Math.ceil(5.0));
        System.out.println(Math.ceil(5.4));
        System.out.println(Math.ceil(5.6));

        System.out.println("----------------");

        System.out.println(Math.floor(5.0));
        System.out.println(Math.floor(5.4));
        System.out.println(Math.floor(5.6));

        System.out.println("----------------");

        System.out.println(Math.min(3, 5));
        System.out.println(Math.max(3, 5));

        System.out.println("----------------");

        System.out.println(Math.pow(2,4));

        System.out.println("----------------");

        System.out.println(Math.random()); // [0, 1)

        System.out.println("----------------");

        System.out.println(Math.round(5.0));
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6));

        System.out.println("----------------");

        System.out.println(Math.sqrt(16));

        System.out.println("----------------");

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
