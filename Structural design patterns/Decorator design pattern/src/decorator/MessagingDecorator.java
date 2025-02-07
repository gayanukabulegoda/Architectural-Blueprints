package decorator;

import server.MessagingService;
/**
 * The base decorator class which implements the MessagingService interface
 * and has a reference to the MessagingService object.
 */
public abstract class MessagingDecorator implements MessagingService {
    MessagingService messagingService;

    public MessagingDecorator(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public abstract void sendMessage(String message);
}