package org.example.Creational.AbstractFactory;

public class PizzaFactory extends AbstractFastFoodFactory {

    public Pizza getPizza(String type) {
        if (type.equals("Cheese")) {
            return new CheesePizza();
        } else if (type.equals("Margheritta")) {
            return new MargherittaPizza();
        } else {
            return null;
        }
    }

    @Override
    Drinks getDrink(String type) {
        return null;
    }
}
