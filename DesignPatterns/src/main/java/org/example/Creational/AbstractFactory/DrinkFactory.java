package org.example.Creational.AbstractFactory;

public class DrinkFactory extends AbstractFastFoodFactory {

    @Override
    Pizza getPizza(String type) {
        return null;
    }

    public Drinks getDrink(String drinkType) {
        if (drinkType == null) {
            return null;
        }
        if (drinkType.equalsIgnoreCase("MUDPIE")) {
            return new Mudpie();
        } else if (drinkType.equalsIgnoreCase("COKE")) {
            return new Coke();
        }
        return null;
    }
}
