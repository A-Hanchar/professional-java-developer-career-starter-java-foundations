package com.artsiomhanchar.lectures.section_2_classes_object_methods;

import com.artsiomhanchar.lectures.section_2_classes_object_methods.business.Company;

import java.time.LocalDate;

class NewsAgency {
    Company company;
    String name;

    public void accessMethod() {
        Person person = new Person();

        person.lastName = "Smith";
        person.dob = LocalDate.now();
    }
}
