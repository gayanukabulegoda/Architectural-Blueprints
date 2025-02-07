package server;

public class EmailNotificationService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message: " + message);
    }
}