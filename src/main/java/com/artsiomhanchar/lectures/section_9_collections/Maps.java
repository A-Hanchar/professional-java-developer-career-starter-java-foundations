package com.artsiomhanchar.lectures.section_9_collections;

import com.artsiomhanchar.lectures.section_8_more_oop.employees.Employee;
import com.artsiomhanchar.lectures.section_8_more_oop.employees.IEmployee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class Maps {
//    protected static Map<String, Integer> salaryMap = new HashMap<>();
//    protected static Map<String, Integer> salaryMap = new TreeMap<>();
    protected static Map<String, Integer> salaryMap = new LinkedHashMap<>();

//    protected static Map<String, IEmployee> employeesMap = new HashMap<>();

    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=1000,yoe=10,iq=140}
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

        while (peopleMatcher.find()) {
            IEmployee employee = Employee.createEmployee(peopleMatcher.group());

            Employee emp = (Employee) employee;

//            employeesMap.put(emp.firstName, employee);

//            salaryMap.put(emp.firstName, emp.getSalary());
            salaryMap.putIfAbsent(emp.firstName, emp.getSalary());
        }

//        for(String key: salaryMap.keySet()) {
//            System.out.printf("%s: %d%n", key, salaryMap.get(key));
//        }

        System.out.println(salaryMap);
        System.out.println(salaryMap.values());
        System.out.println(salaryMap.keySet());
        System.out.println(salaryMap.size());
        System.out.println(salaryMap.entrySet());

        for (Map.Entry<String, Integer> entry: salaryMap.entrySet()) {
            System.out.printf("Key = %s, Value = %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println(salaryMap.containsKey("Wilma3"));
        System.out.println(salaryMap.containsValue(0));

        System.out.println(salaryMap.isEmpty());

//        System.out.println(employeesMap);
    }

    public int getSalary(String firstName) {
//        return employeesMap.get(firstName).getSalary();
//        return salaryMap.get(firstName);

        return salaryMap.getOrDefault(firstName, -1);
    }
}
