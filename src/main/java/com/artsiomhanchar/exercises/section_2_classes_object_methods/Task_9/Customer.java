package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_9;

public class Customer {
//    How can you ensure that a Customer instance can not be created without a name and an
//initial deposit?

    public String name;
    public int deposit;

    public Customer(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }
}
