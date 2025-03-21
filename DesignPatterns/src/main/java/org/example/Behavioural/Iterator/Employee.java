package org.example.Behavioural.Iterator;

public class Employee {

    private int salary;
    private String name;;
    private String department;
    private String position;

    public Employee(int salary, String name, String department, String position) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void printEmployee() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department + ", Position: " + position);
    }
}
