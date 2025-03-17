package org.example.Behavioural.Observer;

import java.util.concurrent.Flow;

public class Demo {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Observer subscriber1 = new Subscriber1();
        Observer subscriber2 = new Subscriber1();
        weather.subscribe(subscriber1);
        weather.subscribe(subscriber2);
        weather.setMeasurements(10, 20);
        weather.setMeasurements(30, 20);
        weather.unsubscribe(subscriber1);
        weather.setMeasurements(40, 20);
    }
}
