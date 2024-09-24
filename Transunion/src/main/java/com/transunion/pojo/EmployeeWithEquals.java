package com.transunion.pojo;

public class EmployeeWithEquals extends Employee {
    public EmployeeWithEquals(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeWithEquals employee = (EmployeeWithEquals) obj;
        return getId() == employee.getId();
    }
}
