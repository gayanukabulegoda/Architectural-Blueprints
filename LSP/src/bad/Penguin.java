package bad;

public class Penguin extends Bird {
    @Override
    void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}