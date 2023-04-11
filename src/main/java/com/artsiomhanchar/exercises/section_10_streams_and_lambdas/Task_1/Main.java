package com.artsiomhanchar.exercises.section_10_streams_and_lambdas.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    record Car(String make, String model) {}

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "X"));
        cars.add(new Car("BMW", "E30"));
        cars.add(new Car("Tesla", "3"));

//        cars
//                .stream()
//                .forEach(car -> System.out.println(car.model));

        cars
                .stream()
                .map(Car::model)
                .forEach(System.out::println);
    }
}
