package b.creational.d.factory.method;

public class FactoryMethodDemo {
	public static void printContentType(MessageCreator messageCreator) {
		Message message = messageCreator.getMessage();
		String contentType = message.contentType();
		System.out.println("contentType: " + contentType);
	}
	
	public static void main(String[] args) {
		printContentType(new TextMessageCreator());
		printContentType(new JsonMessageCreator());
	}
}
