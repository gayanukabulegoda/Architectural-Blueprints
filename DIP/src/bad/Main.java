package bad;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 10:25 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        Switch bulbPowerSwitch = new Switch(bulb);

        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
    }
}