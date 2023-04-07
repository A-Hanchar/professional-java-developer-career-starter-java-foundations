package com.artsiomhanchar.lectures.section_5_numbers;

public class BitsAndBytes {
    /**
     * Based on 0 and 1
     *
     * ... 128 64 32 16 8 4 2 1
     *
     * 1) Take number right number in [max ... our Number ... min] and add 1 under min
     * 2)
     *    2.1) First time: our number minus min, and then step 1
     *    2.2) Another times: Rested number minus min (after step 1) and then step 1
     *
     *  Example 1:
     *  Number 33 => 1 0 0 0 0 1
     *  Take number right number in [max ... our Number ... min] => [64, ... 33, 32] and add 1
     *
     *  ... 128 64 32 16 8 4 2 1
     *              1
     *  our number minus min number => 33 - 32 === 1 and repeat step 1
     *  ... 128 64 32 16 8 4 2 1
     *              1          1
     *   Empty places === 0
     *
     *   Result: 100001
     *
     *   Example 2:
     *   Number 54 => 1 1 0 1 1 0
     *
     *   ... 128 64 32 16 8 4 2 1
     *               1  1   1 1
     *
     *   1) [64, ... 54, ... 32] => add 1 under 32
     *   2) 54 - 32 === 22
     *   3) [32, ... 22, ... 16] => add 1 under 16
     *   4) 22 - 16 === 6
     *   5) [8, ... 6, ... 4] => add 1 under 4
     *   6) 6 - 4 === 2
     *   7) add 1 under 2
     *
     *   Result 110110
     *
     */
}
