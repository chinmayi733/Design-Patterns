package org.example.Structural.FlyWeight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        ConcreteCharacter concreteCharacter = characterFactory.getCharacter('a', "Arial");
        concreteCharacter.display(1, 2);
        concreteCharacter = characterFactory.getCharacter('b', "Arial");
        concreteCharacter.display(3, 4);
        concreteCharacter = characterFactory.getCharacter('a', "Arial");
        concreteCharacter.display(5, 6);
    }
}
