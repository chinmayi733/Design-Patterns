package org.example.Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    Map<Character,ConcreteCharacter> characterMap = new HashMap<>();

    public ConcreteCharacter getCharacter(char character,String font){
        ConcreteCharacter concreteCharacter = characterMap.get(character);
        if(concreteCharacter == null){
            concreteCharacter = new ConcreteCharacter(character,font);
            characterMap.put(character,concreteCharacter);
        }
        return concreteCharacter;
    }
}
