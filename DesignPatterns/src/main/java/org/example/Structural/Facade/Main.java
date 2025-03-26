package org.example.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new DvdPlayer(), new Projector(), new Remote());
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
