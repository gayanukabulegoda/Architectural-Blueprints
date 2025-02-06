package good;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 09:40 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        SocketWriter socketWriter = new SocketWriter();
        DatabaseWriter databaseWriter = new DatabaseWriter();

        fileWriter.write("Hello, this is a message");
        socketWriter.write("Hello, this is a message");
        databaseWriter.write("Hello, this is a message");
    }
}