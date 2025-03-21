package org.example.Behavioural.Iterator;

import java.util.ArrayList;

public class ClientCode {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "John", "HR", "Manager");
        Employee employee2 = new Employee(2000, "Jane", "IT", "Developer");
        Employee employee3 = new Employee(3000, "Doe", "Finance", "Accountant");

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(employee1);
        list1.add(employee2);
        list1.add(employee3);

        EmployeeIterator employeeIterator = new EmployeeIterator(list1);

        while(employeeIterator.hasNext()) {
            employeeIterator.next().printEmployee();
        }
    }
}
