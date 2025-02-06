package bad;

public class UserRegistrationManager {
    public void registerUser(String name, String email) {
        saveData(name, email);
        sendEmail(email);
        logUser(name);
    }

    public void logUser(String name) {
        System.out.println("Logging user : " + name);
    }

    public void sendEmail(String email) {
        System.out.println("Sending email to : " + email);
    }

    public void saveData(String name, String email) {
        System.out.println("Saving user data : " + name + " " + email);
    }
}