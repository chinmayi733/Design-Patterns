package org.example.Structural.FlyWeight;

public class ConcreteCharacter implements CharacterInterface{
    private char character;
    private String font;
    public ConcreteCharacter(char character,String font){
        this.character = character;
        this.font = font;
    }
    @Override
    public void display(int x, int y) {
        System.out.println(character + " is being displayed at " + x + "," + y);
    }
}
