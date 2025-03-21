package org.example.Behavioural.Iterator;

import java.util.ArrayList;

public class EmployeeIterator implements Iterator<Employee> {

    private ArrayList<Employee> employees;
    private int position=0;

    public EmployeeIterator(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(position++);
    }
}
