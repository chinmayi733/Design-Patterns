package org.example.Creational.AbstractFactory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}
