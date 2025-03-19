package org.example.Creational.AbstractFactory;

class FactoryProducer {
    public static AbstractFastFoodFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PIZZA")) return new PizzaFactory();
        if (choice.equalsIgnoreCase("DRINK")) return new DrinkFactory();
        return null;
    }
}
