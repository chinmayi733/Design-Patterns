package org.example.Behavioural.Observer;

public interface Subject {
    int d = 0;
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
