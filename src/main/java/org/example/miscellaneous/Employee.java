package org.example.miscellaneous;

import java.util.List;
import java.util.Objects;

public class Employee {

    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public Employee(int id, String departmentName, int salary) {
        this.id = id;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(departmentName, employee.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentName, salary);
    }
}
