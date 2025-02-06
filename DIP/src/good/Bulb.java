package good;
/**
 * Low level module : Bulb
 */
public class Bulb implements Device {
    public boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;
        System.out.println("Bulb is " + (isOn ? "on" : "off"));
    }
}