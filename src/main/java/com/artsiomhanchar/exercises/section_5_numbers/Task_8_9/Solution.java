package com.artsiomhanchar.exercises.section_5_numbers.Task_8_9;

public class Solution {
    /**
     * Use printf() to format the following inputs to print out the following outputs
     *
     * Input                        Output
     * 123456.783                   $123,456.78
     * -9876.32532                  (9,876.325)
     * 23.19283928394829182         2.319284e+01f
     * 123456                       0000123456
     * -9876.35532                  -9,876.4
     *
     * 9. How could you format each of the inputs in the table above and store them in String
     * variables instead of just printing them out directly?
     */

    public static void main(String[] args) {
        double input1 = 123456.783;
        System.out.printf("$%,.2f%n", input1);

        double input2 = -9876.32532;
        System.out.printf("%,(.2f%n", input2);

        double input3 = 23.19283928394829182;
        System.out.printf("%5.6ef%n", input3);

        int input4 = 123456;
        System.out.printf("0000%d%n", input4);

        double input5 = -9876.35532;
        System.out.printf("%,.1f%n", input5);
    }
}
