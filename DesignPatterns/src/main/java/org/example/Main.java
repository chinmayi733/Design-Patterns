package org.example;

import org.example.Creational.Singleton.SingletonDesignPattern;
import org.example.Creational.Singleton.SingletonEarly;

public class Main {
    public static void main(String[] args) {
        //lazy
        SingletonDesignPattern s = SingletonDesignPattern.getSingleton();
        SingletonDesignPattern  s2 = SingletonDesignPattern.getSingleton();
        System.out.println("s is " + s.hashCode());
        System.out.println("s2 is " + s2.hashCode());

        //eager
        SingletonEarly s1 =  SingletonEarly.getSingleton();
        System.out.println("s1 is " + s1.hashCode());
        SingletonEarly  s4 =  SingletonEarly.getSingleton();
        System.out.println("s4 is " + s4.hashCode());

        //The hash code acts as a unique identifier for the object, although it is not guaranteed to be unique. Different objects can have the same hash code value.

    }
}