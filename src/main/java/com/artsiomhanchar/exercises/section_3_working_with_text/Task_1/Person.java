package com.artsiomhanchar.exercises.section_3_working_with_text.Task_1;

public class Person {
//    Model a Person with a first name and last name and ensure that even if the first name is
//entered all lowercase, it will be stored all uppercase.
    static String firstName;
    static String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(firstName)
                .append(" ")
                .append(lastName)
                .toString();
    }
}
