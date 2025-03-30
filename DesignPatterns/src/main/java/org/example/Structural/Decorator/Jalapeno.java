package org.example.Structural.Decorator;

public class Jalapeno implements Toppings {
    private final Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
