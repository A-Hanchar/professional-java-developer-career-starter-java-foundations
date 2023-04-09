package com.artsiomhanchar.exercises.section_9_collections.Task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Car.CAR_MODEL.BMW, Car.CAR_BODY.COMPACT, 1);
        Car car2 = new Car(Car.CAR_MODEL.JAGUAR, Car.CAR_BODY.SUPERCAR, 2);
        Car car3 = new Car(Car.CAR_MODEL.LEXUS, Car.CAR_BODY.COMPACT, 3);
        Car car4 = new Car(Car.CAR_MODEL.OPEL, Car.CAR_BODY.COMPACT, 4);
        Car car5 = new Car(Car.CAR_MODEL.MERCEDES, Car.CAR_BODY.MINIVAN, 5);

        Car car6 = new Car(Car.CAR_MODEL.BMW, Car.CAR_BODY.COMPACT, 1);

        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);

        for (Car car: carSet) {
            System.out.println(car);
        }
    }
}
