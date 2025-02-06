package bad.sample_02;

public class Airplane extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Airplane engine is starting");
    }

    @Override
    public void move() {
        System.out.println("Airplane is moving");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}