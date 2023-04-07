package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_11;

import java.util.Arrays;

public class Classmates {
    Classmate[] classmates = new Classmate[0];

    private static <T> T[] append(T[] arr, T element)
    {
        T[] array = Arrays.copyOf(arr, arr.length + 1);
        array[arr.length] = element;

        return array;
    }

    public void addClassmate(Classmate classmate) {
//        System.out.println(classmates);
//        System.out.println(classmates.length);

//        classmates[0] = classmate;

        classmates = append(classmates, classmate);
    }

    public void showClassmates() {
        for(int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i]);
        };
    }
}
