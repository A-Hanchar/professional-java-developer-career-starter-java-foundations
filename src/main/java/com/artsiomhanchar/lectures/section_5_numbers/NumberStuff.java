package com.artsiomhanchar.lectures.section_5_numbers;

public class NumberStuff {
    public static void main(String[] args) {
        /**
         * 1byte = 8 bit
         * bytes and boolean are kept in memory as bytes
         * range bytes -128 to 127 (not 128, one byte for negative number)
         *
         * boolean - true 1, false 0
         *
         * 2bytes = 16 bits
         * range (-32768 to 32767)
         *
         * char is kept in 2bytes
         *
         * integer is kept in 32 Bit ()
         * long - in 64 Bit ()
         *
         * float numbers - 32 bits (whole part 4 bits , exponent(.) 4 bits , last part 23 bits)
         */
        byte myByte = 127; // address on this variable looks like @2F3582A21
        System.out.println(myByte);

        /**
         * 192.168.1.1 = IP address
         * Netmask / network mask
         *
         * 5.5.5.3
         * 0b0101 0b0101 0b0101 0b0011 - 0101 0101 0101 0011
         *                               1111 1111 1100 0000
         * */

        boolean myFlag = true;
        System.out.println(myFlag);

        short myShort = 45;
        char myChar = 'A'; // in memory 65

        int myNumber = 211111111;

        double myDouble = 3.141592;
        float myFloat = 3.141592f;

        byte anotherByte = 0x1f;
//        int anotherInt = 0b01 | 0b10 | 0b100;
        int anotherInt = 0b100 & 0b011;

        System.out.println(anotherInt);
    }
}
