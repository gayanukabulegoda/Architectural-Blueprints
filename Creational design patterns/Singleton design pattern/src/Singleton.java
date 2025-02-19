/**
 * Singleton class - This class is responsible for creating a single instance of the GlobalHandler class.
 */
public class Singleton {
    private static Singleton singleton;
    private final GlobalHandler globalHandler;

    private Singleton() {
        System.out.println("Singleton instance created");
        globalHandler = new GlobalHandler();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public GlobalHandler getGlobalHandler() {
        return globalHandler;
    }
}