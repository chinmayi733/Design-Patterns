package org.example.Factory;

public class RoadTransport implements Transport{

    @Override
    public void deliver()
    {
        System.out.println("road road");
    }
}
