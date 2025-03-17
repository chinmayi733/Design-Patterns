package org.example.Behavioural.Observer;

import java.util.concurrent.Flow;

public class Demo {
    public static void main(String[] args) {
        Weather weather = new Weather(10,50);
        Observer subscriber1 = new Subscriber1();
        Observer subscriber2 = new Subscriber1();
        weather.subscribe(subscriber1);
        weather.subscribe(subscriber2);
        weather.notifyObservers();
    }
}
