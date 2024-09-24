package com.transunion.pojo;

import java.util.Objects;

public class EmployeeWithHashCode extends Employee {
    public EmployeeWithHashCode(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
