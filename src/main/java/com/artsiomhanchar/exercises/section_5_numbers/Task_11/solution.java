package com.artsiomhanchar.exercises.section_5_numbers.Task_11;

public class solution {
    /**
     * Write a method that takes the String inputs, “37” & “13”, and returns an integer of their
     * sum, 50.
     */

    public static void main(String[] args) {
        String str1 = "37";
        String str2 = "13";

        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);

        System.out.println(sum);
    }
}
