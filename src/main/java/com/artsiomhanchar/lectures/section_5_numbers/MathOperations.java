package com.artsiomhanchar.lectures.section_5_numbers;

public class MathOperations {
    public static void main(String[] args) {
        /*
        System.out.println(3 + 5 + 2 + 7);
        System.out.println(10 - 7);
        System.out.println(7 * 4);
        System.out.println(7 / 4); // 1
        System.out.println(7. / 4); // 1.75 (double)
        System.out.println(7 / 4f); // 1.75 (float)
        System.out.println((double) 7 / 4); // 1.75
        System.out.println((double) (7 / 4)); // 1.0
         */

//        System.out.println(5 * ((float)(3 + 2) / 10));
//        System.out.println(4 % 2);

        int x = 1;
        System.out.println(x);

        x = x + 1;
        x += 1;
        System.out.println(x);

        System.out.println(++x);
        System.out.println(x++);

        x -= 1;
        System.out.println(x);

        System.out.println(--x);
        System.out.println(x--);

        System.out.println(x);

        boolean b1 = true;
        System.out.println(b1);
        System.out.println(!b1);
        System.out.println(!!b1);
    }
}
