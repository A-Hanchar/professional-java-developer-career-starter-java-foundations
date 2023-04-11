package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DomainModelWithStreamsAPI {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\Hr5m.csv");

    record Person(String firstName, String lastName, long salary) {}

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Stream<String> fileLines = Files
                .lines(Path.of(directory.getAbsolutePath()));

            Long totalSalary = fileLines
                    .parallel()
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(array -> new Person(array[2], array[4], Long.parseLong(array[25])))
                    .collect(Collectors.summingLong(Person::salary));

            long endTime = System.currentTimeMillis();

            System.out.printf("$%,d.00%n", totalSalary);
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
