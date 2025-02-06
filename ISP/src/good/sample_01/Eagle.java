package good.sample_01;

public class Eagle extends Bird implements FlyingBird {
    @Override
    void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}