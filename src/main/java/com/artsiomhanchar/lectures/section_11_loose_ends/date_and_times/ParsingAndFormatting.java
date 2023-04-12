package com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times;

import com.artsiomhanchar.lectures.section_10_streams_and_lambdas.FunctionalMethodsOfCollections;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParsingAndFormatting {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_11_loose_ends\\date_and_times\\Hr5m.csv");

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

    record Person(String firstName, String lastName, LocalDate birthDate, LocalTime birthTime) {
        long getAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }

        String getDOBAsText() {
            return dateFormatter.format(birthDate);
        }

        LocalDateTime getCompleteDOB() {
            return LocalDateTime.of(birthDate, birthTime);
        }
    }

    public static void main(String[] args) {
        try {
            Stream<String> fileLines = Files
                    .lines(Path.of(directory.getAbsolutePath()));


            fileLines
                    .skip(1)
                    .limit(20)
                    .map(line -> line.split(","))
                    .map(array -> new Person(
                            array[2],
                            array[4],
                            LocalDate.parse(array[10], dateFormatter),
                            LocalTime.parse(array[11], timeFormatter)
                    ))
                    .filter(person -> person.getAge() < 30)
//                    .count();
                    .forEach(person -> System.out.printf("%s, %s %s - %d%n", person.lastName, person.firstName, person.getDOBAsText(), person.getAge()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
