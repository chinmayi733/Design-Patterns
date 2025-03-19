package org.example.Creational.AbstractFactory;

abstract class  AbstractFastFoodFactory {
    abstract Pizza getPizza(String type);
    abstract Drinks getDrink(String type);
}

