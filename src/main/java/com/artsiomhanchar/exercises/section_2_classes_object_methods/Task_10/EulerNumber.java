package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_10;

public class EulerNumber {
    double number;

    public EulerNumber(double number) {
        this.number = number;
    }

    public double getEulerNumber() {
        return Math.exp(number);
    }
}
