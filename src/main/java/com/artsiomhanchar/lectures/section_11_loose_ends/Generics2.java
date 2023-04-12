package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Generics2<T extends Generics2.IDable<V> & Generics2.Saveable, V> {
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

    Optional<T> findById(long id) {
        return records
                .stream()
                .filter(line -> line.id().equals(id))
                .findFirst();
    }
}
