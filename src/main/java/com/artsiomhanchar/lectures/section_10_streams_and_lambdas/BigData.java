package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigData {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\Hr5m.csv");

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();

            Stream<String> fileLines = Files
                    .lines(Path.of(directory.getAbsolutePath()));

//            fileLines
//                    .limit(2)
//                    .forEach(System.out::println);

//            System.out.println(
//                    fileLines
//                            .skip(1)
//                            .count()
//            );

//            System.out.println(
//                    fileLines
//                            .skip(1)
//                            .collect(Collectors.counting())
//            );

            Long result = fileLines
                    .parallel()
                    .skip(1) // it's the head with titles
//                    .limit(10)
                    .map(line -> line.split(","))
                    .map(arr -> arr[25])
                    .mapToLong(salary -> Long.parseLong(salary))
                    .sum();
//                    .map(salary -> Long.parseLong(salary))
//                    .collect(Collectors.summingLong(salary -> Long.parseLong(salary)));
//                    .forEach(System.out::println);

            long endTime = System.currentTimeMillis();

            System.out.printf("$%,d.00%n", result);
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
