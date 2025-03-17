package org.example.Behavioural.Observer;

import java.util.ArrayList;

public class Weather implements Subject{

    private int temperature;
    private int humidity;
    private ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers)
        {
            observer.notified(this.temperature,this.humidity);
        }
    }

    public void setMeasurements(int temperature, int humidity)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
