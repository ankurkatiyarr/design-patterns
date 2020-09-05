package b.creational.d.factory.method;

public class TextMessageCreator extends MessageCreator {
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
