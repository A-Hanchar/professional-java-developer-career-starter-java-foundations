package com.artsiomhanchar.exercises.section_9_collections.Task_5;

import java.time.Year;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    record Car(String make, String model, Year year) implements Comparable<Car> {
//        @Override
//        public int compareTo(Car o) {
//            return this.model.compareTo(o.model);
//        }
//
        @Override
        public int compareTo(Car o) {
            return o.model.compareTo(this.model);
        }
    }

    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car("Tesla", "S", Year.of(2014)));
        cars.add(new Car("Tesla", "X", Year.of(2015)));
        cars.add(new Car("Tesla", "X", Year.of(2015))); // duplicate
        cars.add(new Car("Tesla", "3", Year.of(2016)));
        cars.add(new Car("Tesla", "3", Year.of(2016))); // duplicate
        cars.add(new Car("Tesla", "Y", Year.of(2017)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009)));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(cars.size());
    }
}
