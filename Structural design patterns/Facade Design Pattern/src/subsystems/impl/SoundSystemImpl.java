package subsystems.impl;

import subsystems.SoundSystem;

public class SoundSystemImpl implements SoundSystem {
    @Override
    public void setVolume(int volume) {
        System.out.println("Sound volume is set to " + volume);
    }

    @Override
    public void turnOn() {
        System.out.println("Sound system is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound system is turned OFF");
    }
}