package com.artsiomhanchar.exercises.section_9_collections.Task_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Car.CAR_MODEL.BMW, Car.CAR_BODY.COMPACT, 1);
        Car car2 = new Car(Car.CAR_MODEL.JAGUAR, Car.CAR_BODY.MINIVAN, 2);
        Car car3 = new Car(Car.CAR_MODEL.LEXUS, Car.CAR_BODY.COMPACT, 3);
        Car car4 = new Car(Car.CAR_MODEL.OPEL, Car.CAR_BODY.MINIVAN, 4);
        Car car5 = new Car(Car.CAR_MODEL.MERCEDES, Car.CAR_BODY.SUPERCAR, 5);

        Map<String, Car> carMap = new LinkedHashMap<>();
        carMap.put(String.valueOf(car1.getId()), car1);
        carMap.put(String.valueOf(car2.getId()), car2);
        carMap.put(String.valueOf(car3.getId()), car3);
        carMap.put(String.valueOf(car4.getId()), car4);
        carMap.put(String.valueOf(car5.getId()), car5);

        System.out.println(carMap);
    }
}
