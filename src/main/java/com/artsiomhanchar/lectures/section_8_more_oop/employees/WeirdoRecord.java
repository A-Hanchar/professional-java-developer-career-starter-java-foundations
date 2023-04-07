package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.time.LocalDate;

/**
 * @see class WeirdoRecord is analog of Weirdo class (setters, getters and hasCode)
 *
 * @param lastName
 * @param firstName
 * @param dob
 */
public record WeirdoRecord(String lastName, String firstName, LocalDate dob) implements Apple {
    public WeirdoRecord(String lastName, String firstName) {
        this(lastName, firstName, LocalDate.of(1,1,1));
    }

    public String sayHello() {
        return "Hello World!";
    }
}
