package bad;
/**
 * Low level module : Fan
 */
public class Fan {
    public boolean isOn = false;

    public void toggle() {
        isOn = !isOn;
        System.out.println("Bulb is " + (isOn ? "on" : "off"));
    }
}