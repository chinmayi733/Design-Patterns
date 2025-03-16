package org.example.Factory;

public class TransportFactory {

    public static Transport getInstance(String input)
    {
        if(input.trim().equalsIgnoreCase("ROAD"))
            return new RoadTransport();
        else if(input.trim().equalsIgnoreCase("SEA"))
            return new SeaTransport();
        else
            return null;
    }
}
