package bad;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 09:30 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer();
        writer.writeToFile("Hello, this is a message");
        writer.writeToSocket("Hello, this is a message");
        writer.writeToDatabase("Hello, this is a message");
    }
}