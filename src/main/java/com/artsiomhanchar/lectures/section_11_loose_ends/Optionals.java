package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<String> optMessage = Optional.of("Hello");
        System.out.println(optMessage);

        Optional<String> optMessage2 = Optional.ofNullable(null);
        System.out.println(optMessage2.orElse("There was nothing there").toUpperCase());
//
//      equals
//
        if (optMessage2.isPresent()) {
            System.out.println(optMessage2.get().toUpperCase());
        } else {
            System.out.println("There was nothing there");
        }
//
//      equals
//
        if (optMessage2.isEmpty()) {
            System.out.println("There was nothing there");
        } else {
            System.out.println(optMessage2.get().toUpperCase());
        }

//        Exceptions
//        System.out.println(optMessage2.orElseThrow());
//        System.out.println(optMessage2.orElseThrow(() -> new RuntimeException("Nothing Found")));

        System.out.println(optMessage2.orElseGet(() -> "My alternative text"));

        System.out.println(optMessage2.or(() -> Optional.of("Nothing here")));

        System.out.println(optMessage2.filter(s -> s.length() > 3).orElse("Invalid"));

        Optional<String> optMessage3 = Optional.of("Hello");
        System.out.println(optMessage3.filter(s -> s.length() > 3).orElse("Invalid"));
    }
}
