package bad.sample_02;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 10:08 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.startEngine();
        airplane.move();
        airplane.fly();

        Car car = new Car();
        car.startEngine();
        car.move();
        car.fly();
    }
}