public class ConcreteObserver implements Observer {
    private final String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String state) {
        System.out.println("Observer " + observerName + " received state change: " + state);
    }
}