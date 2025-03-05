package subsystems.impl;

import subsystems.TVSystem;

public class TVSystemImpl implements TVSystem {
    @Override
    public void setChannel(int channel) {
        System.out.println("TV channel is set to " + channel);
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}