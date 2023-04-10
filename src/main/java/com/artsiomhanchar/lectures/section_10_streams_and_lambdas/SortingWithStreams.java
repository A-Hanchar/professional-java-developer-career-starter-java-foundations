package com.artsiomhanchar.lectures.section_10_streams_and_lambdas;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.Employee;

import java.util.Comparator;

public class SortingWithStreams {
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

        peopleText
                .lines()
                .map(Employee::createEmployee)
//                .sorted((x, y) -> Integer.compare(x.getSalary(), y.getSalary()))
//                .sorted() // It's work, because class Employee implement Comparable (extends Comparable)
                .map(employee -> (Employee) employee)
                .sorted(
                        Comparator
                                .comparing(Employee::getLastName) // (x , y) -> x.getLastName().compareTo(y.getLastName())
                                .thenComparing(Employee::getFirstName)
//                                .thenComparing(Employee::getSalary)
                                .thenComparingInt(Employee::getSalary)
                                .reversed()
                )
                .forEach(System.out::println);
    }
}
