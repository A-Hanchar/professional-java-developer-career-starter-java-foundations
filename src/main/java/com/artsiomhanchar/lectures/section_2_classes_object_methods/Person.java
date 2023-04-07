package com.artsiomhanchar.lectures.section_2_classes_object_methods;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName = "Christopher";
    public String lastName;
    protected LocalDate dob;
    public static double PI = 3.14;
    public static int[] nums = initNums();

    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
    }

    public static int[] initNums() {
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;

        return nums;
    };

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void test(String[] words) {
        // do something clever with words
    }

    public void test2(String... words) {
        // do something clever

        System.out.println(words[0]);
    }

    public static void main(String[] args) {
        Person p1 = new Person();

        p1.firstName = "Jack";
        p1.lastName = "Smith";

        p1.sayHello();
        p1.saySomething("My groove message");
        p1.saySomething("Here's something else to say");

        char middleInitial = p1.getMiddleInitial();

        System.out.println(middleInitial);
        System.out.println(p1.add(10, 15));

        String[] words = {"one", "two", "three"};
        p1.test(words);

        p1.test2("one", "two", "three");
    }
}
