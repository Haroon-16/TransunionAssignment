package com.transunion.pojo;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and toString
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}