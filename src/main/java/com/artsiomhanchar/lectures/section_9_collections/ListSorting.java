package com.artsiomhanchar.lectures.section_9_collections;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.Employee;
import com.artsiomhanchar.lectures.section_8_more_oop.employees.IEmployee;

import java.util.*;
import java.util.regex.Matcher;

public class ListSorting {
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

        Matcher peopleMatcher = Employee.PEOPLE_PATTERN.matcher(peopleText);

        List<IEmployee> employees =  new ArrayList<>();

        while (peopleMatcher.find()) {
            IEmployee employee = Employee.createEmployee(peopleMatcher.group());
            employees.add(employee);
        }

//        employees.sort(new Comparator<IEmployee>() {
//            @Override
//            public int compare(IEmployee o1, IEmployee o2) {
//                if (o1 instanceof Employee employeeO1 && o2 instanceof Employee employeeO2) {
//                    int lastNameComparing = employeeO1.lastName.compareTo(employeeO2.lastName);
//                    return lastNameComparing != 0 ? lastNameComparing : Integer.compare(employeeO1.getSalary(), employeeO2.getSalary());
//                }
//                return 0;
//            }
//        });

//        employees.sort((o1, o2) -> {
//            if (o1 instanceof Employee employeeO1 && o2 instanceof Employee employeeO2) {
//                int lastNameComparing = employeeO1.lastName.compareTo(employeeO2.lastName);
//                return lastNameComparing != 0 ? lastNameComparing : Integer.compare(employeeO1.getSalary(), employeeO2.getSalary());
//            }
//            return 0;
//        });

//        Collections.sort(employees, (o1, o2) -> {
//            if (o1 instanceof Employee employeeO1 && o2 instanceof Employee employeeO2) {
//                int lastNameComparing = employeeO1.lastName.compareTo(employeeO2.lastName);
//                return lastNameComparing != 0 ? lastNameComparing : Integer.compare(employeeO1.getSalary(), employeeO2.getSalary());
//            }
//            return 0;
//        });

        Collections.sort(employees, Comparator.reverseOrder());

        for (IEmployee employee: employees) {
            System.out.println(employee);
        }

        List<String> undesirables = new ArrayList(List.of("Wilma5", "Barney4", "Fred2"));
        undesirables.sort(Comparator.naturalOrder());

        for (String str: undesirables) {
            System.out.println(str);
        }
    }
}
