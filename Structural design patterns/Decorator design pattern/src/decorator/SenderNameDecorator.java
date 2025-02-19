package decorator;

import server.MessagingService;
/**
 * A concrete decorator class which extends the MessagingDecorator class
 * and adds a sender name to the message before sending it (runtime).
 */
public class SenderNameDecorator extends MessagingDecorator {
    private final String senderName;

    public SenderNameDecorator(MessagingService messagingService, String senderName) {
        super(messagingService);
        this.senderName = senderName;
    }

    @Override
    public void sendMessage(String message) {
        messagingService.sendMessage(message);
        System.out.println("Message sent by " + senderName);
    }
}