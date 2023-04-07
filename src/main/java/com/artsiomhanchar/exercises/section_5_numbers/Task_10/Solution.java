package com.artsiomhanchar.exercises.section_5_numbers.Task_10;

import java.text.DecimalFormat;

public class Solution {
    /**
     *  Use instances of DecimalFormat to perform the same conversions in the table above.
     */

    public static void main(String[] args) {
        System.out.println(new DecimalFormat("$,###.##").format(123456.783));
        System.out.println(new DecimalFormat(",###.###;(#)").format(-9876.32532));
        System.out.println(new DecimalFormat("0.######E00f").format( 23.19283928394829182));
        System.out.println(new DecimalFormat("0000000000").format(123456));
        System.out.println(new DecimalFormat(",###.#;-").format(-9876.35532));
    }
}
