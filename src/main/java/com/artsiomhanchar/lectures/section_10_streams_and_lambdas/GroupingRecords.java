package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingRecords {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\Hr5m.csv");

    record Person(String firstName, String lastName, long salary, String state) {}

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Stream<String> fileLines = Files
                .lines(Path.of(directory.getAbsolutePath()));

//            Map<String, List<Person>> peoplesGroupedByState = fileLines
//                    .parallel()
//                    .skip(1)
//                    .limit(10)
//                    .map(line -> line.split(","))
//                    .map(array -> new Person(array[2], array[4], Long.parseLong(array[25]), array[32]))
////                    .collect(Collectors.groupingBy(Person::state));
//                    /**
//                     * first parameter - what we want and group by what field we want to group by
//                     * second parameter - what type of map do we want to use
//                     * third parameter - what do we want to do with all the resulting records for each category
//                     */
//                    .collect(Collectors.groupingBy(Person::state, TreeMap::new, Collectors.toList()));
//
//            System.out.println(peoplesGroupedByState);

//            TreeMap<String, String> totalSalaryGroupedByState = fileLines
//                    .parallel()
//                    .skip(1)
//                    .map(line -> line.split(","))
//                    .map(array -> new Person(array[2], array[4], Long.parseLong(array[25]), array[32]))
//                    .collect(Collectors.groupingBy(
//                            Person::state,
//                            TreeMap::new,
//                            Collectors.collectingAndThen(
//                                    Collectors.summingLong(Person::salary),
//                                    NumberFormat.getCurrencyInstance()::format
////                                    salary -> NumberFormat.getCurrencyInstance().format(salary)
////                                    salary -> String.format("%,d..00%n", salary)
//                            )
////                            Collectors.summingLong(Person::salary)
//                    ));
//
//            System.out.println(totalSalaryGroupedByState);

            fileLines
                    .parallel()
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(array -> new Person(array[2], array[4], Long.parseLong(array[25]), array[32]))
                    .collect(Collectors.groupingBy(
                            Person::state,
                            TreeMap::new,
                            Collectors.collectingAndThen(
                                    Collectors.summingLong(Person::salary),
                                    NumberFormat.getCurrencyInstance()::format
//                                    salary -> NumberFormat.getCurrencyInstance().format(salary)
//                                    salary -> String.format("%,d..00%n", salary)
                            )
                    ))
                    .forEach((state, salary) -> System.out.printf("%s -> %s%n", state, salary));

            long endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
