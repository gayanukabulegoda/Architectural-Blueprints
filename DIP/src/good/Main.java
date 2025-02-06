package good;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 10:35 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Switch fanPowerSwitch = new Switch(fan);

        fanPowerSwitch.press();
        fanPowerSwitch.press();
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}