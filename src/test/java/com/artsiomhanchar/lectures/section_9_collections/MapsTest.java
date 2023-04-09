package com.artsiomhanchar.lectures.section_9_collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapsTest {
    @Test
    public void testNameToSalary() {
        Maps main = new Maps();

        main.main(new String[0]);
        int salary = main.getSalary("Wilma");

        assertEquals(2506, salary);
    }
}
