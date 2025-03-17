package org.example.Behavioural.Observer;

public class Subscriber1 implements Observer{
    @Override
    public void notified(int temperature, int humidity) {
        System.out.println("Subscriber notified with temparature: "+temperature+" and humidity: "+humidity);
    }
}
