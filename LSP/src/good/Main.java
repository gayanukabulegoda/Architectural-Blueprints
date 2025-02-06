package good;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 09:59 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
    }
}