/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://grbulegoda.me/
 * -------------------------------------------------------------------
 * Created: 05-03-2025 07:10 PM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        // Create the subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        Observer observer1 = new ConcreteObserver("A");
        Observer observer2 = new ConcreteObserver("B");

        // Register observers with the subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Change the state of the subject; observers will be notified automatically
        subject.setState("State 1");
        subject.setState("State 2");
    }
}