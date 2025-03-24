package org.example.Behavioural.ChainOfResponsibility;

public class InfoLogger extends Logger{

    public InfoLogger(Logger l) {
        super(l);
    }

    @Override
    public void logMessage(int level, String message)
    {
        if(level==1)
        {
            System.out.println("Info Logger: "+message);
        }
        else
        {
            super.logMessage(level, message);
        }
    }
}
