package com.artsiomhanchar.exercises.section_10_streams_and_lambdas.Task_6;

import java.time.Year;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    record Car(String make, String model, Year year, int price) {}

    public static void main(String[] args) {
        Stream<Car> cars = Stream.of(
                new Car("Tesla", "S", Year.of(2014), 90000),
                new Car("Tesla", "X", Year.of(2015), 110000),
                new Car("Tesla", "3", Year.of(2016), 55000),
                new Car("Tesla", "Y", Year.of(2017), 60000),
                new Car("Tesla", "Roadster", Year.of(2009), 135000)
        );

//        String result = cars
//                .map(Car::model)
//                .collect(Collectors.joining(","));
//

        String result = cars
                .map(Car::model)
                .reduce((a, b) -> String.format("%s,%s", a, b))
                .orElse("");

        System.out.println(result);
    }
}
