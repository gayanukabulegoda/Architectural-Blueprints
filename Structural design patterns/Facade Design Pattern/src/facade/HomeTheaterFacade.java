package facade;

import subsystems.DVDPlayer;
import subsystems.SoundSystem;
import subsystems.TVSystem;
import subsystems.impl.DVDPlayerImpl;
import subsystems.impl.SoundSystemImpl;
import subsystems.impl.TVSystemImpl;
/**
 * Facade class that provides a simple interface to the client to interact with.
 */
public class HomeTheaterFacade implements HomeTheater {
    private final TVSystem tvSystem;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        tvSystem = new TVSystemImpl();
        soundSystem = new SoundSystemImpl();
        dvdPlayer = new DVDPlayerImpl();
    }

    @Override
    public void watchMovie(String movieName) {
        tvSystem.turnOn();
        tvSystem.setChannel(5);

        soundSystem.turnOn();
        soundSystem.setVolume(20);

        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movieName);
    }

    @Override
    public void stopMovie() {
        dvdPlayer.turnOff();
        tvSystem.turnOff();
        soundSystem.turnOff();
    }
}