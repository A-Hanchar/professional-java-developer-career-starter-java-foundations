package com.artsiomhanchar.exercises.section_5_numbers.Task_1;

public class Solution {
    /**
     * If you could receive up to eight different types of radio signals simultaneously (into your
     * computer & a program you wrote) and you needed to be able to record which of those eight
     * you received at any given time, what would be a highly compact (or compressed - using
     * the least amount of memory or storage) way to record them (using what you learned in this
     * module)? For example, you could receive signals A + B + C simultaneously, or A + D, or just
     * G, etc.
     * 1. If you received signals A + D + C simultaneously, how could you efficiently determine
     * that D was one of the signals you received - based on your solution above?
     *
     * Comment:
     * Terry Martin
     * January 7, 2022 at 5:20:05 PM
     * You could assign each type of
     * signal to a bit of one byte. For
     * each type of signal received, turn
     * on its corresponding bit. Then,
     * convert the binary bit pattern to a
     * number.
     */

    public static void main(String[] args) {
        // Let H    G    F    E    D    C    B    A  -  be assigned values
        //    128   64   32   16   8    4    2    1
        int signalABC = 1 | 2 | 4; // 7
        int signalAD = 1 | 8; // 9
        int signalADC = 1 | 8 | 4; // 13

        // test if signal D is present in ADC
        System.out.println((13 & 8) == 8); // Logical AND of original signal (13) AND 'D' (8) will equal 8 IF and only IF 'D' was present in original signal
    }
}
