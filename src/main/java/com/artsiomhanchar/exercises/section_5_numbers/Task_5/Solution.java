package com.artsiomhanchar.exercises.section_5_numbers.Task_5;

public class Solution {
    /**
     * Make a method, next(), that can be called 10 times and generate a random integer between
     * 0 & 10 (non-inclusive). This method keep a running sum of all random numbers it generates
     * and return that sum each time. If first time next() is called, it generates 5, and second time
     * it’s called it generates 3, it should return 8 from the second call - for example.
     */

    static int sum = 0;

    public static int next() {
        int min = 0;
        int max = 10;

        int number = (int) Math.floor(Math.random() * (max - min) + min);

        System.out.printf("Generated random number: %d %n", number);

        sum += number;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
    }
}
