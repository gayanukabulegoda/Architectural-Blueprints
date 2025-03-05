/**
 * Factory class to create car objects based on the car type.
 */
public class CarFactory {
    public Car createCar(CarType carType) {
        return switch (carType) {
            case SEDAN -> new Sedan();
            case SUV -> new Suv();
            case HATCHBACK -> new Hatchback();
            case CROSSOVER -> new Crossover();
            case CONVERTIBLE -> new Convertible();
        };
    }
}