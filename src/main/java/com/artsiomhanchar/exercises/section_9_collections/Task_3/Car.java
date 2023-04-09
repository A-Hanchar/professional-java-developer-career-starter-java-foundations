package com.artsiomhanchar.exercises.section_9_collections.Task_3;

import java.util.Objects;

public class Car {
    enum CAR_MODEL {
        BMW,
        OPEL,
        MERCEDES,
        LEXUS,
        JAGUAR;
    }

    enum CAR_BODY {
        COMPACT,
        MINIVAN,
        SUPERCAR;
    }

    private CAR_MODEL model;
    private CAR_BODY carBody;

    public Car(CAR_MODEL model, Car.CAR_BODY carBody) {
        this.model = model;
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", model, carBody);
    }
}
