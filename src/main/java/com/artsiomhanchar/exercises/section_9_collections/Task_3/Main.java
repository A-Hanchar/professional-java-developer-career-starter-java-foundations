package com.artsiomhanchar.exercises.section_9_collections.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Car.CAR_MODEL.BMW, Car.CAR_BODY.COMPACT);
        Car car2 = new Car(Car.CAR_MODEL.JAGUAR, Car.CAR_BODY.MINIVAN);
        Car car3 = new Car(Car.CAR_MODEL.OPEL, Car.CAR_BODY.SUPERCAR);

        Map<String, Car> ownersMap = new HashMap<>();
        ownersMap.put("Bob", car1);
        ownersMap.put("Jenny", car2);
        ownersMap.put("Sarah", car3);

        System.out.println(ownersMap);
    }
}
