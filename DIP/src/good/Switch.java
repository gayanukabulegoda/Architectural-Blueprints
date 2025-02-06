package good;
/**
 * High level module : Switch
 */
public class Switch {
    private final Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void press() {
        device.toggle();
    }
}