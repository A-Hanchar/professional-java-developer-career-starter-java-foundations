package com.artsiomhanchar.lectures.section_11_loose_ends;

public class Exceptions {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        int num = 0;

//        try {
//            System.out.println(array.length / num);
//        } catch (Exception error) {
//            error.printStackTrace();
//        }
//
//        try {
//            System.out.println(array[5]);
//        } catch (Exception error) {
//            error.printStackTrace();
//        }

//        try {
//            System.out.println(array.length / num);
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException error) {
//            System.out.println("The array index blah blah blah was thrown here");
//        } catch (ArithmeticException error) {
//            System.out.println("This is due to the arithmetic being thrown");
//        }

//        try {
//            System.out.println(array.length / num);
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException error) {
//            System.out.println("Something went terribly wrong: " + error.getMessage());
//        }

        doSecondLevel(array, num);
        System.out.println("You made it to the end");
    }

    private static void doSecondLevel(String[] array, int num) {
        try {
            System.out.println(array.length / num);
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException error) {
            System.out.printf("Exception type: %s. Message: %s%n", error.getClass(), error.getMessage());

            error.printStackTrace();
        }
    }
}
