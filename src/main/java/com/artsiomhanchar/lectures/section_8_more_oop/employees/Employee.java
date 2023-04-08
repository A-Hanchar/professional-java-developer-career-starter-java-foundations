package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee implements IEmployee {
    public String firstName;
    public String lastName;
    protected LocalDate dob;
    protected String employeeDetails;
    private int salary = 0;

    private static final String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?(\\n,\\s)?";
    public static final Pattern PEOPLE_PATTERN = Pattern.compile(peopleRegex);

    protected final Matcher peopleMatcher;

    protected final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    protected final DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    protected Employee() {
        peopleMatcher = null;

        this.lastName = "N/A";
        this.firstName = "N/A";
        this.dob = null;
    }

    protected Employee(String employeeText) {
        peopleMatcher = Employee.PEOPLE_PATTERN.matcher(employeeText);

        class myLocalClass {
            public int getNum() {
                return 5;
            }
        }

        if (peopleMatcher.find()) {
            this.firstName = peopleMatcher.group("firstName");
            this.lastName = peopleMatcher.group("lastName");
            this.dob = LocalDate.from(dtFormatter.parse(peopleMatcher.group("dob")));
            this.employeeDetails = peopleMatcher.group("details");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static final IEmployee createEmployee(String employeeText) {
        Matcher peopleMatcher = Employee.PEOPLE_PATTERN.matcher(employeeText);

        if (peopleMatcher.find()) {
            return switch  (peopleMatcher.group("role")) {
                case "Programmer" -> new Programmer(employeeText);
                case "Manager" -> new Manager(employeeText);
                case "Analyst" -> new Analyst(employeeText);
                case "CEO" -> new CEO(employeeText);
//                default -> new DummyEmployee();
//                default -> new Employee() {
//                    @Override
//                    public double getBonus() {
//                        return 0;
//                    }
//                };
                default -> () -> 0; // Lambda expression
            };
        }

        return new DummyEmployee();
    }

    public int getSalary() {
        return salary;
    }

    public abstract double getBonus();

    @Override
    public String toString() {
        return String.format("%s, %s: %s. Bonus - %s", lastName, firstName, moneyFormat.format(getSalary()), moneyFormat.format(getBonus()));
    }

    private final static class DummyEmployee extends Employee {
        @Override
        public double getBonus() {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dob.equals(employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob);
    }

    public record Jumper(String firstName, String lastName) {}
}
