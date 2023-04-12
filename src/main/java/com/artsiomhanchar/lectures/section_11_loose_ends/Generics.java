package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
    record Person(String firstName, String lastName, Long id) {}

    private List<T> records = new ArrayList<T>();

    List<T> findAll() {
        return records;
    }

    T save(T record) {
        records.add(record);

        return record;
    }

    T findById(long id) {
        return records.get(Long.valueOf(id).intValue());
    }

    public static void main(String[] args) {
        Generics<String> repo = new Generics<>();

        repo.save("house");
        repo.save("tree");
        repo.save("boat");

        System.out.println(repo.findAll());

        Generics<Person> personRepo = new Generics<>();
        personRepo.save(new Person("Jake", "Johnson", 1L));
        personRepo.save(new Person("Mary", "Johnson", 2L));
        personRepo.save(new Person("Jerry", "Johnson", 3L));

        System.out.println(personRepo.findAll());
    }
}
