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

            System.out.println(
                    fileLines
                            .skip(1)
                            .collect(Collectors.counting())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
