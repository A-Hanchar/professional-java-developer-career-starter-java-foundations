package com.artsiomhanchar.exercises.section_11_loose_ends.Task_3;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution {
    record Person(String firstName, String lastName){}

    public static void main(String[] args) {
        Person person1 = new Person("FirstName1", "LastName1");
        Person person2 = null;
        Person person3 = new Person("FirstName3", "LastName3");
        Person person4 = null;
        Person person5 = new Person("FN5", "LastName5");

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.add(person5);

        for(Person person: listOfPeople) {
            System.out.println(
                    Optional
                            .ofNullable(person)
                            .map(Person::firstName)
                            .filter(name -> name.length() > 3)
                            .orElse("Unknown")
            );
        }
    }
}
