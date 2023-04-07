package com.artsiomhanchar.exercises.section_5_numbers.Task_4;

public class Solution {
    /**
     * Imagine you’ve been given data representing how long items have sat in a warehouse. Your
     * job is to categorize them by time in the warehouse. Items can be classified as 0, 1, 2 or 3.
     * Items in class 0 are less than 89 days old. Class 1 = 90-179 days, Class 2 = 180-269 days,
     * Class 3 = 270-364 days. For the given warehouse wait times: 13, 49, 90, 130, 175, 181,
     * 255, 310, 330, 359, write a class similar to Exercise 3 above, that has a next() method that
     * can be called 10 times and outputs a number representing the classification of each
     * number in the set of ages above. Example: an item waiting for 5 days would return 0 and
     * an item waiting 92 days would return 1.
     */

    static int[] items = new int[]{13, 49, 90, 130, 175, 181, 255, 310, 330, 359};
    static int countOfCalls = 0;

    public static int next() {
        int item = items.length - 1 >= countOfCalls ? items[countOfCalls] : 0;

        countOfCalls++;

        if(item >= 1 && item <= 89) return 0;
        if(item >= 90 && item <= 179) return 1;
        if(item >= 180 && item <= 269) return 2;
        if(item >= 270 && item <= 364) return 3;

        return -1;
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
    }
}
