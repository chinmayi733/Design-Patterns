package org.example.Behavioural.ChainOfResponsibility;

public abstract class Logger {

    public Logger nextLogger;
    public Logger(Logger l)
    {
        this.nextLogger = l;
    }

    public void logMessage(int level, String message)
    {
        if(this.nextLogger != null)
        {
            this.nextLogger.logMessage(level, message);
        }
        else
        {
            System.out.println("No logger present to log the message");
        }
    }
}
