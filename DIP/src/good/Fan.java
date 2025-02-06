package good;
/**
 * Low level module : Fan
 */
public class Fan implements Device {
    public boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;
        System.out.println("Fan is " + (isOn ? "on" : "off"));
    }
}