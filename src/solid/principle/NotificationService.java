package solid.principle;
// dependency inversion
interface MessageService {
	void sendMessage(String message, String receiver);
}

class EmailService implements MessageService {
	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Email sent to " + receiver + " with message: " + message);
	}
}

class SMSService implements MessageService {
	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS sent to " + receiver + " with message: " + message);
	}
}

public class NotificationService {
	private MessageService messageService;

	// Dependency Injection via constructor
	NotificationService(MessageService messageService) {
		this.messageService = messageService;
	}

	void notify(String message, String receiver) {
		messageService.sendMessage(message, receiver);
	}

	public static void main(String[] args) {

		// Create an instance of EmailService and inject it into NotificationService
		MessageService emailService = new EmailService();               
		NotificationService notificationService1 = new NotificationService(emailService);
		notificationService1.notify("Hello via Email", "shahbaz@example.com");

		// Create an instance of SMSService and inject it into NotificationService
		MessageService smsService = new SMSService();
		NotificationService notificationService2 = new NotificationService(smsService);
		notificationService2.notify("Hello via SMS", "123-456-7890");

	}
}
