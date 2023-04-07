package com.artsiomhanchar.exercises.section_8_more_oop.Task_5;

public class Solution {
    /**
     * Write a method that does the opposite of #4 - taking a number, 1-26, and returns a
     * lowercase letter. 1 would return a, 2 = b, 26 = z, etc.
     */

    public static void main(String[] args) {
        System.out.println(getLowerLetter(1));
        System.out.println(getLowerLetter(2));
        System.out.println(getLowerLetter(26));
    }

    public static char getLowerLetter(int number) {
        int codeOfLowerA = 96;

        return (char) (number + codeOfLowerA);
    }
}
