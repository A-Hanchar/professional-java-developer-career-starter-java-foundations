package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_7;

public class Car {
//    Model a Car, create an instance of it, pass it to System.out.println() so that its properties will
//    be printed.

    String model;
    int yearOfProduction;

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return  "Car: {" +
                "model='" + model + "', " +
                "yearOfProduction=" + yearOfProduction +
                '}';
    }
}
