package good.sample_02;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}