package org.example.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margheritta();
        System.out.println(pizza.getCost());

        Pizza pizza1 = new VeggieDelight();

        pizza = new Jalapeno(pizza);
        System.out.println(pizza.getCost());

        pizza1 = new Jalapeno(pizza1);
        System.out.println(pizza1.getCost());
    }
}
