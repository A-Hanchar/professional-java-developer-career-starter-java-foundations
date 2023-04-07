package com.artsiomhanchar.lectures.section_1_getting_start_with_java.specific.animals;

import com.artsiomhanchar.lectures.section_1_getting_start_with_java.model.Pet;

public class Cat extends Pet {
    public void meow() {
        System.out.println("Meow meow!");

        super.protectedMethod();
    }

    @Override
    public String toString() {
        return "Cat - name: tony";
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        System.out.println(cat1);
    }
}
