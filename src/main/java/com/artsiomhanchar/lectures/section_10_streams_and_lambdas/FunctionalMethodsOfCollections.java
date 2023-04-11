package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalMethodsOfCollections {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\Hr5m.csv");

    record Person(String firstName, String lastName, BigDecimal salary, String state, char gender) {}

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();

            Stream<String> fileLines = Files
                    .lines(Path.of(directory.getAbsolutePath()));

            Map<String, Long> result = fileLines
                    .skip(1)
//                    .limit(200)
                    .map(line -> line.split(","))
                    .map(array -> new Person(
                            array[2],
                            array[4],
                            new BigDecimal(array[25]),
                            array[32],
                            array[5]
                                    .strip()
                                    .charAt(0)
                    ))
                    .collect(Collectors.groupingBy(Person::state, Collectors.counting()));

            long endTime = System.currentTimeMillis();

//            result.replaceAll((key, value) -> value * 2);

            System.out.println(result);
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        try {
//            Map<String, Long> stateCounts = new HashMap<>();
//
//            Stream<String> fileLines = Files
//                    .lines(Path.of(directory.getAbsolutePath()));
//
//            fileLines
//                    .skip(1)
//                    .map(line -> line.split(","))
//                    .forEach(a -> stateCounts.compute(a[32], (key, value) -> value == null ? 1L : value + 1));
//
//            System.out.println(stateCounts);
//
////            Long curPopulation = stateCounts.get("CA");
////
////            if (curPopulation == null) {
////                stateCounts.put("CA", 1l);
////            } else {
////                stateCounts.put("CA", ++curPopulation);
////            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
