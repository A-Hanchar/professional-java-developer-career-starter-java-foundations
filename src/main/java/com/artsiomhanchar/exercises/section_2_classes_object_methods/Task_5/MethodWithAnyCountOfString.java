package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_5;

public class MethodWithAnyCountOfString {
//    Write a method that allows you to pass any number of Strings as parameter inputs without
//    using an array.
    public static void getAnyKindOfString(String... strings) {
        System.out.println(strings[1]);
    }

    public static void main(String[] args) {
        getAnyKindOfString("One", "Two", "Three");
    }
}
