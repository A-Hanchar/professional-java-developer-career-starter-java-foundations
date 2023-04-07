package com.artsiomhanchar.lectures.section_1_getting_start_with_java;

import com.artsiomhanchar.lectures.section_1_getting_start_with_java.model.Person;

import java.time.LocalDate;

public class HelloWorld extends Object {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you!");

//        Person tom = new Person("Tom", "Smith", LocalDate.of(1984, 6, 15));
//        Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));
//
//        tom.setSpouse(janet);
//
//        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));
//
//        fido.bark();
//
//        tom.setPet(fido);
//
//        System.out.println(tom);

        Person johnny = new Person("johnny", "smith", LocalDate.of(2000, 11, 1));

        System.out.format("The person's first name is: %s.", johnny.getFirstName());

        johnny.setLastName("smith");
        System.out.format("The person's last name is: %s.", johnny.getLastName());

        System.out.println(johnny.dob);

        johnny.dob = LocalDate.of(2010, 1, 10);
        System.out.println(johnny.dob);
    }
}
