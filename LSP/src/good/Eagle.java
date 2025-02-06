package good;

public class Eagle extends Bird {
    @Override
    void eat() {
        System.out.println("Eagle is eating");
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }
}