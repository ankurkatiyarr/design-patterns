package b.creational.d.factory.method;

public abstract class MessageCreator {
	public Message getMessage() {
		Message message = createMessage();
		message.encrypt();
		
		return message;
	}
	
	public abstract Message createMessage();
}
