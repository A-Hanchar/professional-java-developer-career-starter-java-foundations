package com.artsiomhanchar.exercises.section_10_streams_and_lambdas.Task_3;

import java.time.Year;
import java.util.stream.Stream;

public class Main {
    record Car(String make, String model, Year year) {}

    public static void main(String[] args) {
        Stream<Car> cars = Stream.of(
                new Car("Tesla", "S", Year.of(2014)),
                new Car("Tesla", "X", Year.of(2015)),
                new Car("Tesla", "3", Year.of(2016)),
                new Car("Tesla", "Y", Year.of(2017)),
                new Car("Tesla", "Roadster", Year.of(2009))
        );

            cars.forEach(System.out::println);

    }
}
