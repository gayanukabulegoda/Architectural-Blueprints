package subsystems.impl;

import subsystems.DVDPlayer;

public class DVDPlayerImpl implements DVDPlayer {

    @Override
    public void playMovie(String movieName) {
        System.out.println("Playing movie: " + movieName);
    }

    @Override
    public void stopMovie() {
        System.out.println("Movie stopped");
    }

    @Override
    public void turnOn() {
        System.out.println("DVD player is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("DVD player is turned OFF");
    }
}