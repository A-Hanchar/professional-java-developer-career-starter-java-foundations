package com.artsiomhanchar.exercises.section_9_collections.Task_1;

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

    private int id;
    private CAR_MODEL model;
    private CAR_BODY carBody;

    public Car(CAR_MODEL model, CAR_BODY carBody, int id) {
        this.model = model;
        this.carBody = carBody;
        this.id = id;
    }

    public CAR_MODEL getModel() {
        return model;
    }

    public CAR_BODY getCarBody() {
        return carBody;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return String.format("%s (%s)", model, carBody);
    }
}
