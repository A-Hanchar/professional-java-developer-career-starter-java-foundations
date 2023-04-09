package com.artsiomhanchar.lectures.section_9_collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapScenarioTest {
    @Test
    public void testNameToSalary() {
        MapScenario main = new MapScenario();

        main.main(new String[0]);
        int salary = main.getSalary("Wilma");

        assertEquals(2506, salary);
    }
}