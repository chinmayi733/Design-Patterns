package org.example.Behavioural.ChainOfResponsibility;

public class ErrorLogger extends Logger
{

    public ErrorLogger(Logger l) {
        super(l);
    }

    @Override
    public void logMessage(int level, String message)
    {
        if(level==2)
        {
            System.out.println("Error Logger: "+message);
        }
        else
        {
            super.logMessage(level, message);
        }
    }
}
