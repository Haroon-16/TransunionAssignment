package com.transunion.pojo;

import java.util.Objects;

public class EmployeeWithBoth extends Employee {
    public EmployeeWithBoth(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeWithBoth employee = (EmployeeWithBoth) obj;
        return getId() == employee.getId() &&
               Objects.equals(getFirstName(), employee.getFirstName()) &&
               Objects.equals(getLastName(), employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName());
    }
}

