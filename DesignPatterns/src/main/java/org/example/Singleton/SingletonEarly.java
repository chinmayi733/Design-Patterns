package org.example.Singleton;

public class SingletonEarly {

    private static final SingletonEarly singleton  = new SingletonEarly();

    private  SingletonEarly() {
    }


    //earlyinitialization or eager
    public static SingletonEarly getSingleton()
    {
        return singleton;
    }
}
