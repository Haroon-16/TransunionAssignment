package com.transunion.threadtest;

import org.junit.jupiter.api.Test;

import com.transunion.pojo.Employee;

import java.util.Comparator;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeSortingTest {

    @Test
    public void testDefaultSorting() {
        TreeSet<Employee> employees = new TreeSet<>(Comparator.comparingInt(Employee::getId));
        employees.add(new Employee(2, "Alice", "Smith"));
        employees.add(new Employee(1, "Bob", "Brown"));
        assertEquals("Employee{id=1, firstName='Bob', lastName='Brown'}", employees.first().toString());
    }

    @Test
    public void testCustomSortingByFirstName() {
        TreeSet<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getFirstName));
        employees.add(new Employee(2, "Alice", "Smith"));
        employees.add(new Employee(1, "Bob", "Brown"));
        assertEquals("Employee{id=2, firstName='Alice', lastName='Smith'}", employees.first().toString());
    }
}
