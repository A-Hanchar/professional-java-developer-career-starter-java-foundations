package com.artsiomhanchar.lectures.section_9_collections;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.*;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
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
                Rubble, Betty, 4/4/1915, NULL, {avgStockPrice=300}
                """;

        Matcher peopleMatcher = Employee.PEOPLE_PATTERN.matcher(peopleText);

        int totalSalaries = 0;
        IEmployee employee = null;

//        List employees =  new ArrayList<IEmployee>();
//        List<IEmployee> employees =  new ArrayList();
        List<IEmployee> employees =  new LinkedList();

        while (peopleMatcher.find()) {
            employee = Employee.createEmployee(peopleMatcher.group());

            employees.add(employee);
        }

        List<String> removalNames = new ArrayList<>();
        removalNames.add("Wilma5");
        removalNames.add("Barney4");
        removalNames.add("Fred2");

        removeUndesirables(employees, removalNames);

        for (IEmployee worker : employees) {
//            Impossible to remove node from the LinkedList in this type of loop
//            if (worker instanceof Employee) {
//                Employee updatedWorker = (Employee) worker;
//
//                if ( removalNames.contains(updatedWorker.firstName)) {
//                    employees.remove(worker);
//                }
//            }

            System.out.println(worker.toString());
            totalSalaries += worker.getSalary();
        }

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));

        WeirdoRecord larry = new WeirdoRecord("David", "Larry", LocalDate.of(1950, 1, 1));
        System.out.println(larry.firstName());

        WeirdoRecord jack = new WeirdoRecord("Snake", "Jake");
        jack.sayHello();
    }

    private static void removeUndesirables(List<IEmployee> employees, List<String> removalNames) {
        for (Iterator<IEmployee> it = employees.iterator(); it.hasNext();) {
           IEmployee worker = it.next();

            if (worker instanceof Employee updatedWorker) {
                if ( removalNames.contains(updatedWorker.firstName)) {
                    it.remove();
                }
            }
        }
    }
}
