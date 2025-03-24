package org.example.Behavioural.ChainOfResponsibility;

public class DebugLogger extends Logger{

    public DebugLogger(Logger l) {
        super(l);
    }

    @Override
    public void logMessage(int level, String message)
    {
        if(level==3)
        {
            System.out.println("Debug Logger: "+message);
        }
        else
        {
            super.logMessage(level, message);
        }
    }
}
