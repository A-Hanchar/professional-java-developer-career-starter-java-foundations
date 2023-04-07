package com.artsiomhanchar.exercises.section_5_numbers.Task_2;

public class Solution {
    /**
     * What’s an alternative way you could add 2 + 4 without using “+” symbol?
     *
     * Comment:
     * 2. Terry Martin
     * January 7, 2022 at 5:17:36 PM
     * Take the binary bit pattern
     * representing the signal types
     * received, and AND it with the
     * binary bit pattern of the signal type
     * you’re testing for.
     * If you received 1 0 1, and you want
     * to know if the leftmost bit is a 1,
     * you’d AND
     * 1 0 1 AND
     * 1 0 0
     * The result would be:
     * 1 0 0
     * And you’d k
     */

//    public static void main(String[] args) {
//        System.out.println(2 + 4);
//
//        BigInteger num1 = new BigInteger("2");
//        BigInteger num2 = new BigInteger("4");
//
//        System.out.println(num1.add(num2));
//
//        byte byte1 = 2;
//        byte byte2 = 4;
//
//        System.out.println(byte1 | byte2);
//    }

    public static void main(String[] args) {
        System.out.println(2 | 4);
        System.out.println(2 + 4);
    }
}
