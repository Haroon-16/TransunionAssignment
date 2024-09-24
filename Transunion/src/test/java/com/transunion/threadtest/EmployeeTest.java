package com.transunion.threadtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.transunion.pojo.Employee;
import com.transunion.pojo.EmployeeWithBoth;
import com.transunion.pojo.EmployeeWithEquals;
import com.transunion.pojo.EmployeeWithHashCode;

public class EmployeeTest {
	
	@Test
	public void testWithoutEqualsAndHashCode() {
	    Employee emp1 = new Employee(1, "John", "Doe");
	    Employee emp2 = new Employee(1, "John", "Doe");
	    HashSet<Employee> employees = new HashSet<>();
	    employees.add(emp1);
	    employees.add(emp2);
	    assertEquals(2, employees.size()); // Should be 2
	}

	@Test
	public void testWithOnlyHashCode() {
	    Employee emp1 = new EmployeeWithHashCode(1, "John", "Doe");
	    Employee emp2 = new EmployeeWithHashCode(1, "John", "Doe");
	    HashSet<Employee> employees = new HashSet<>();
	    employees.add(emp1);
	    employees.add(emp2);
	    assertEquals(2, employees.size()); // Should be 2
	}

	@Test
	public void testWithOnlyEquals() {
	    Employee emp1 = new EmployeeWithEquals(1, "John", "Doe");
	    Employee emp2 = new EmployeeWithEquals(1, "John", "Doe");
	    HashSet<Employee> employees = new HashSet<>();
	    employees.add(emp1);
	    employees.add(emp2);
	    assertEquals(2, employees.size()); // Should be 2
	}

	@Test
	public void testWithBothEqualsAndHashCode() {
	    Employee emp1 = new EmployeeWithBoth(1, "John", "Doe");
	    Employee emp2 = new EmployeeWithBoth(1, "John", "Doe");
	    HashSet<Employee> employees = new HashSet<>();
	    employees.add(emp1);
	    employees.add(emp2);
	    assertEquals(1, employees.size()); // Should be 1
	}
}
