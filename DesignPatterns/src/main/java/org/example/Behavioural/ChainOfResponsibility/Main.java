package org.example.Behavioural.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Logger l = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        l.logMessage(1, "This is an info message");
        l.logMessage(2, "This is an error message");
        l.logMessage(3, "This is a debug message");
        l.logMessage(4, "This is an unknown message");
    }
}
