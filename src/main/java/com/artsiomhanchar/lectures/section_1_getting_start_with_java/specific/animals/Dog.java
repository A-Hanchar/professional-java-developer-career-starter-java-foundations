package com.artsiomhanchar.lectures.section_1_getting_start_with_java.specific.animals;

import com.artsiomhanchar.lectures.section_1_getting_start_with_java.model.Pet;

import java.time.LocalDate;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public void bark() {
        System.out.println("Ruff ruf!!!");
    }
}
