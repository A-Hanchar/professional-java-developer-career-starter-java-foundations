package com.artsiomhanchar.exercises.section_9_collections.Task_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Sportcar"); // duplicate
        Car car2 = new Car("BMW", "Compact");
        Car car3 = new Car("OPEL", "Compact");
        Car car4 = new Car("Tesla", "Sportcar"); // duplicate
        Car car5 = new Car("Lada", "Minivan");

        Set<Car> carsSet = new HashSet<>();
        carsSet.add(car1);
        carsSet.add(car2);
        carsSet.add(car3);
        carsSet.add(car4);
        carsSet.add(car5);

        for (Car car: carsSet) {
            System.out.println(car);
        }

        System.out.println(carsSet.size());
    }
}
