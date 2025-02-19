/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 11:40 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        GlobalHandler globalHandler1 = Singleton.getInstance().getGlobalHandler();
        GlobalHandler globalHandler2 = Singleton.getInstance().getGlobalHandler();
        GlobalHandler globalHandler3 = Singleton.getInstance().getGlobalHandler();

        System.out.println(globalHandler1.equals(globalHandler2));
        System.out.println(globalHandler2.equals(globalHandler3));
        System.out.println(globalHandler1.equals(globalHandler3));

        System.out.println(globalHandler1.hashCode());
        System.out.println(globalHandler2.hashCode());
        System.out.println(globalHandler3.hashCode());
    }
}