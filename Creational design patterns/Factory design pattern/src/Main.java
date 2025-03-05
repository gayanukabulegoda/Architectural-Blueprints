/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://grbulegoda.me/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 11:48 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car sedan = carFactory.createCar(CarType.SEDAN);
        Car suv = carFactory.createCar(CarType.SUV);
        Car hatchback = carFactory.createCar(CarType.HATCHBACK);
        Car crossover = carFactory.createCar(CarType.CROSSOVER);
        Car convertible = carFactory.createCar(CarType.CONVERTIBLE);

        System.out.println(sedan.getDetails());
        System.out.println(suv.getDetails());
        System.out.println(hatchback.getDetails());
        System.out.println(crossover.getDetails());
        System.out.println(convertible.getDetails());
    }
}