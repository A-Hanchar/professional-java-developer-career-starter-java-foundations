package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class StreamsStuff {
    final static File directory = new File("./\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\employees.txt");

    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
                Flinstone2, Fred2, 1/1/1900, Programmer111111111, {locpd=1300,yoe=14,iq=100}
                Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
                Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
                Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
                Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
                Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
                Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
                Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

        try {
//            Files.lines(Path.of("C:\\Users\\ahanchar\\Desktop\\professional-java-developer-career-starter-java-foundations\\src\\main\\java\\com\\artsiomhanchar\\lectures\\section_10_streams_and_lambdas\\employees.txt"))
//                    .forEach(System.out::println);

            Files.lines(Path.of(directory.getAbsolutePath()))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        peopleText
            .lines()
            .map(Employee::createEmployee)
//            .map(line -> Employee.createEmployee(line))
            .forEach(System.out::println); // System.out.println("Hello");
//            .forEach(line -> System.out.println(line)); // System.out.println("Hello");

//        Collection<String> nums = Set.of("one", "two", "three", "four");

//        nums
//            .stream()
//            .map(String::hashCode)
//            .map(Integer::toHexString)
//            .forEach(System.out::println);
//
//        nums.stream().map(String::hashCode).forEach(h -> System.out.printf("%h%n", h));

//        ---------------------------

//        record Car(String make, String model) {}
//
//        Stream.of(
//            new Car("Ford", "Bronco"),
//            new Car("Tesla", "X"),
//            new Car("Tesla", "3")
//        )
//            .filter(car -> "Tesla".equals(car.make))
//            .forEach(System.out::println);

        //        ---------------------------
//
//        String myVariable = null;
//        Stream.ofNullable(myVariable)
//            .forEach(System.out::println);

        //        ---------------------------
//
//        IntStream.range(1, 11) // [start, end)
//            .forEach(System.out::println);
//
//        IntStream.rangeClosed(1, 10) // [start, end]
//            .forEach(System.out::println);
//
//        IntStream.rangeClosed(1, 10)
//            .boxed() // -> Stream<Integer>
//            .map(String::valueOf)
//            .map(s -> s.concat("-"))
//            .forEach(System.out::print);
//
//        IntStream.rangeClosed(1, 10)
//            .mapToObj(String::valueOf)
//            .map(s -> s.concat("-"))
//            .forEach(System.out::print);

        //        ---------------------------

        String[] names = {"terry", "sam", "jake"};
        Arrays.stream(names)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
