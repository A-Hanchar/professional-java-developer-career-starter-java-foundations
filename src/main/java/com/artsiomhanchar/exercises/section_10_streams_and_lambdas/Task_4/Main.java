package com.artsiomhanchar.exercises.section_10_streams_and_lambdas.Task_4;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Year;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    record Car(String make, String model, Year year, int price) {}
    record Car2(String make, String model, Year year, BigDecimal price) {}


    public static void main(String[] args) {
        Stream<Car> cars = Stream.of(
                new Car("Tesla", "S", Year.of(2014), 90000),
                new Car("Tesla", "X", Year.of(2015), 110000),
                new Car("Tesla", "3", Year.of(2016), 55000),
                new Car("Tesla", "Y", Year.of(2017), 60000),
                new Car("Tesla", "Roadster", Year.of(2009), 135000)
        );

//        int totalSum = cars.mapToInt(Car::price).sum();
//        int totalSum = cars.collect(Collectors.summingInt(Car::price));
//
//        System.out.println(totalSum);


//        double average = cars.mapToDouble(Car::price).average().orElse(0);
//        double average = cars.collect(Collectors.averagingDouble(Car::price));

//        System.out.println(average);

        Stream<Car2> cars2 = Stream.of(
                new Car2("Tesla", "S", Year.of(2014), new BigDecimal(90000)),
                new Car2("Tesla", "X", Year.of(2015), new BigDecimal(110000)),
                new Car2("Tesla", "3", Year.of(2016), new BigDecimal(55000)),
                new Car2("Tesla", "Y", Year.of(2017), new BigDecimal(60000)),
                new Car2("Tesla", "Roadster", Year.of(2009), new BigDecimal(135000))
        );

//        BigDecimal totalSum = cars2
//                .collect(
//                        Collectors.reducing(BigDecimal.ZERO, Car2::price, (a, b) -> a.add(b))
//                );

        BigDecimal totalSum = cars2
                .map(Car2::price)
//                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalSum);
        System.out.printf(NumberFormat.getCurrencyInstance().format(totalSum));
    }
}
