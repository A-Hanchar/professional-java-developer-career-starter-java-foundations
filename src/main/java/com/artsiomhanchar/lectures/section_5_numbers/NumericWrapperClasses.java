package com.artsiomhanchar.lectures.section_5_numbers;

public class NumericWrapperClasses {
//    public static void main(String[] args) {
//        int num1 = 1;
//
//        Integer num1B = Integer.valueOf(num1); // auto-boxing
//
//        Double myDouble = Double.valueOf(2343.12);
////        Double myDouble = Double.valueOf("2343.12");
//
//        Float myFloat = Float.valueOf(23.23f);
////        Float myFloat = Float.valueOf("23.23f");
//
//        Byte myByte = Byte.valueOf("23");
//
//        storeData(num1);
//    }

    public static void main(String[] args) {
        int age = Integer.parseInt("37");
        double amount = Double.parseDouble("345.12");

        System.out.println(age);
        System.out.println(amount);

        System.out.printf("You will be %d age in 15 years.%n", age + 15);
    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj) {

    }
}
