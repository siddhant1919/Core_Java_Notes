package com.hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	
	private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals method to compare employees by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    // Override hashCode method to generate hash code based on id and name
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
