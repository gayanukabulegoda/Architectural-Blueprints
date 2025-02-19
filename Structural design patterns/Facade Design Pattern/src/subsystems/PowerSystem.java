package subsystems;
/**
 * PowerSystem interface - common interface for all the subsystems that require power to operate.
 */
public interface PowerSystem {
    void turnOn();
    void turnOff();
}
