package org.example.Structural.Facade;

public class HomeTheaterFacade {

    DvdPlayer dvdPlayer;
    Projector projector;
    Remote remote;

    HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Remote remote){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.remote = remote;
    }

    public void watchMovie(){
        remote.on();
        projector.on();
        dvdPlayer.on();
    }

    public void endMovie(){
        remote.off();
        projector.off();
        dvdPlayer.off();
    }
}
