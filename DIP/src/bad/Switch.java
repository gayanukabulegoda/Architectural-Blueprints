package bad;
/**
 * High level module : Switch
 */
public class Switch {
    private final Bulb bulb;
    private final Fan fan;

    public Switch(Bulb bulb, Fan fan) {
        this.bulb = bulb;
        this.fan = fan;
    }

    public Switch(Bulb bulb) {
        this(bulb, null);
    }

    public Switch(Fan fan) {
        this(null, fan);
    }

    public void press() {
        if (bulb != null) {
            bulb.toggle();
        }
        if (fan != null) {
            fan.toggle();
        }
    }
}