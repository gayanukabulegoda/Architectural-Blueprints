package bad;

public class Eagle extends Bird {
    @Override
    void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    void fly() {
        System.out.println("Eagle is flying");
    }
}