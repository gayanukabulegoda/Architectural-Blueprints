package server;

public class SmsMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS message: " + message);
    }
}