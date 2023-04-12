package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.time.Year;
import java.util.List;
import java.util.Optional;

public class Optionals {
    record Car(String make, String model, String color, Year year){}
    record Person(String firstName, String lastName, Car car){}
    record PersonWithOptionCar(String firstName, String lastName, Optional<Car> car){}
    record PersonWithOptionCarAndId(Long id, String firstName, String lastName, Optional<Car> car) implements Generics2.IDable<Long>, Generics2.Saveable {}

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Thumb", new Car("Tesla", "X", "Red", Year.of(2018)));
        Person p2 = new Person("Jerry", "Thumb", new Car("Tesla", "Y", "White", Year.of(2020)));

//        Optional<Person> optPerson = Optional.of(p1);
//        Optional<Person> optPerson = Optional.ofNullable(null);
//        System.out.println(optPerson.map(Person::firstName).orElse("Unknown first name"));

        Optional<Person> optionalPerson2 = Optional.of(p1);
        System.out.println(optionalPerson2.map(Person::car).map(Car::make).orElse("Make unknown"));


        PersonWithOptionCar p3 = new PersonWithOptionCar("Tom", "Thumb", Optional.of(new Car("Tesla", "X", "Red", Year.of(2018))));
        PersonWithOptionCar p4 = new PersonWithOptionCar("Jerry", "Thumb", Optional.of(new Car("Tesla", "Y", "White", Year.of(2020))));

        Optional<PersonWithOptionCar> optionalPerson3 = Optional.of(p3);
        System.out.println(
                optionalPerson3
                        .flatMap(PersonWithOptionCar::car)
                        .map(Car::make)
                        .orElse("Make unknown")
        );

        PersonWithOptionCarAndId p5 = new PersonWithOptionCarAndId(100L,
                "Tom",
                "Thumb",
                Optional.of(
                        new Car(
                                "Tesla",
                                "X",
                                "Red",
                                Year.of(2018)
                        )
                )
        );
        PersonWithOptionCarAndId p6 = new PersonWithOptionCarAndId(
                200L,
                "Jerry",
                "Thumb",
                Optional.of(
                        new Car(
                                "Tesla",
                                "Y",
                                "White",
                                Year.of(2020)
                        )
                )
        );
        PersonWithOptionCarAndId p7 = new PersonWithOptionCarAndId(
                200L,
                "Jake",
                "Thumb",
                Optional.of(
                        new Car(
                                "Tesla",
                                "3",
                                "Blue",
                                Year.of(2019)
                        )
                )
        );
        PersonWithOptionCarAndId p8 = new PersonWithOptionCarAndId(
                200L,
                "Johnny",
                "Thumb",
                Optional.of(
                        new Car(
                                "Tesla",
                                "S",
                                "Black",
                                Year.of(2021)
                        )
                )
        );
        PersonWithOptionCarAndId p9 = null;

        Generics2<PersonWithOptionCarAndId, Long> repo = new Generics2<>();
        repo.save(p5);
        repo.save(p6);

        System.out.println(repo.findById(200L).map(PersonWithOptionCarAndId::firstName).orElse("FirstName not found"));

        List<Optional<PersonWithOptionCarAndId>> people = List.of(Optional.of(p5), Optional.of(p6), Optional.of(p7), Optional.of(p8), Optional.ofNullable(p9));

        people
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(PersonWithOptionCarAndId::firstName)
                .forEach(System.out::println);
    }

//    public static void main(String[] args) {
//        Optional<String> optMessage = Optional.of("Hello");
//        System.out.println(optMessage);
//
//        Optional<String> optMessage2 = Optional.ofNullable(null);
//        System.out.println(optMessage2.orElse("There was nothing there").toUpperCase());
////
////      equals
////
//        if (optMessage2.isPresent()) {
//            System.out.println(optMessage2.get().toUpperCase());
//        } else {
//            System.out.println("There was nothing there");
//        }
////
////      equals
////
//        if (optMessage2.isEmpty()) {
//            System.out.println("There was nothing there");
//        } else {
//            System.out.println(optMessage2.get().toUpperCase());
//        }
//
////        Exceptions
////        System.out.println(optMessage2.orElseThrow());
////        System.out.println(optMessage2.orElseThrow(() -> new RuntimeException("Nothing Found")));
//
//        System.out.println(optMessage2.orElseGet(() -> "My alternative text"));
//
//        System.out.println(optMessage2.or(() -> Optional.of("Nothing here")));
//
//        System.out.println(optMessage2.filter(s -> s.length() > 3).orElse("Invalid"));
//
//        Optional<String> optMessage3 = Optional.of("Hello");
//        System.out.println(optMessage3.filter(s -> s.length() > 3).orElse("Invalid"));
//    }
}
