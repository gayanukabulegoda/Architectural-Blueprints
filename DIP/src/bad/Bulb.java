package bad;
/**
 * Low level module : Bulb
 */
public class Bulb {
    public boolean isOn = false;

    public void toggle() {
        isOn = !isOn;
        System.out.println("Bulb is " + (isOn ? "on" : "off"));
    }
}