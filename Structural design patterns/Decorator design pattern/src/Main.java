import decorator.SenderNameDecorator;
import server.MessagingService;
import server.SmsMessagingService;
/**
 * -------------------------------------------------------------------
 * Author: Gayanuka Bulegoda
 * GitHub: https://github.com/gayanukabulegoda
 * Website: https://gayanukabulegoda.github.io/
 * -------------------------------------------------------------------
 * Created: 06-01-2025 12:32 PM
 * Project: Architectural Blueprints
 * -------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        MessagingService smsMessagingService = new SmsMessagingService();
        smsMessagingService.sendMessage("Hello! i'm a simple message\n");

        MessagingService senderNameWithMessagingService = new SenderNameDecorator(
                new SmsMessagingService(),
                "Gayanuka Bulegoda"
        );
        senderNameWithMessagingService.sendMessage("Hello! i'm a message with sender name\n");
    }
}