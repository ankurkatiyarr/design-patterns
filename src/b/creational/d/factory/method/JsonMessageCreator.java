package b.creational.d.factory.method;

public class JsonMessageCreator extends MessageCreator {
	@Override
	public Message createMessage() {
		return new JsonMessage();
	}
}
