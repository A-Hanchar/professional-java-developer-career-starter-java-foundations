package com.artsiomhanchar.exercises.section_9_collections.Task_6;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.Employee;
import com.artsiomhanchar.lectures.section_8_more_oop.employees.IEmployee;

import java.time.Year;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    record Car(String make, String model, Year year) implements Comparable<Car> {
        @Override
        public int compareTo(Car o) {
            return this.model.compareTo(o.model);
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

        System.out.println(cars.size());

        for (Iterator<Car> carIterator = cars.iterator(); carIterator.hasNext();) {
            String deletedModel = "Roadster";

            if (carIterator.next().model.equals(deletedModel)) {
                carIterator.remove();
            }
        }

        System.out.println(cars.size());
    }
}
