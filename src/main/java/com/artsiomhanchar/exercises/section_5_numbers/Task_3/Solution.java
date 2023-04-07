package com.artsiomhanchar.exercises.section_5_numbers.Task_3;

public class Solution {
    /**
     *Using only what you’ve learned so far in this course, create a class that contains 10
     * lowercase names and has a method that can be called 10 separate times, each time,
     * returning the next name. If the method is called “next()”, the first time it’s called, it returns
     * “name1”, the second time “next()” is called, it returns “name2”, etc.
     * 1. Make the next() method capitalize the first letter of each name as it outputs them
     *
     * Comment:
     * 3. Terry Martin
     * January 8, 2022 at 3:14:11 PM
     * You’ll need a way to store the 10
     * names in a class.
     * You’ll need a way to access each
     * name each time the next() method
     * is called.
     * Consider using an array, a number
     * and incrementing the number.
     *
     */

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
    }

    static String[] names = new String[]{"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10"};
    static int numOfCall = 0;

    public static String next() {
        String result = names.length - 1 >= numOfCall ? names[numOfCall] : "No name";

        numOfCall++;

        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
