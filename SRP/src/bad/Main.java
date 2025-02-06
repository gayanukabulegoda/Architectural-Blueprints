package bad;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 09:10 AM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        UserRegistrationManager userRegistrationManager = new UserRegistrationManager();
        userRegistrationManager.registerUser("John Doe", "johndoe@gmail.com");
    }
}