package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_11;

public class Classmate {
//    Model a class with data that enumerates (associates with a number) the first names of three friends, classmates or coworkers.
//    Make it so that this name data will be shared among all instances of the class.

    String firstName;
    String lastName;

    public Classmate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
