package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Generics<T extends Generics.IDable<V> & Generics.Saveable, V> {
    record Person(String firstName, String lastName, Long id) implements IDable<Long>, Saveable {}

    interface Saveable{}
    interface IDable<IdType> {
        IdType id();
    }

    private List<T> records = new ArrayList<T>();

    List<T> findAll() {
        return records;
    }

    T save(T record) {
        records.add(record);

        return record;
    }

    T findById(long id) {
        return records
                .stream()
                .filter(line -> line.id().equals(id))
                .findFirst()
                .orElseThrow();
//        return records.get(Long.valueOf(id).intValue());
    }

    static <T,V> V encrypt(T data, Function<T, V> callback){
        return callback.apply(data);
    }

    public static void main(String[] args) {
//        Generics<String> repo = new Generics<>();
//
//        repo.save("house");
//        repo.save("tree");
//        repo.save("boat");
//
//        System.out.println(repo.findAll());

        Generics<Person, Long> personRepo = new Generics<>();
        personRepo.save(new Person("Jake", "Johnson", 10L));
        personRepo.save(new Person("Mary", "Johnson", 20L));
        personRepo.save(new Person("Jerry", "Johnson", 30L));

        System.out.println(personRepo.findAll());
        System.out.println(personRepo.findById(10L));

        System.out.println(Generics.<String, String>encrypt("Hello", m -> m.toUpperCase()));
        System.out.println(Generics.<String, Integer>encrypt("Hello", m -> m.hashCode()));
    }
}
