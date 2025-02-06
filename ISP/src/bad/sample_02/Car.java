package bad.sample_02;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car cannot fly");
    }
}