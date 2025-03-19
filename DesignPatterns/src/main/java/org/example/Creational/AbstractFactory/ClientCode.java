package org.example.Creational.AbstractFactory;

public class ClientCode {

    public static void main(String[] args) {
        AbstractFastFoodFactory pizzaFactory = FactoryProducer.getFactory("PIZZA");
        Pizza pizza = pizzaFactory.getPizza("Margheritta");
        pizza.prepare();

        AbstractFastFoodFactory drinksFactory = FactoryProducer.getFactory("DRINK");
        Drinks drinks = drinksFactory.getDrink("Coke");
        drinks.serve();
    }

}
