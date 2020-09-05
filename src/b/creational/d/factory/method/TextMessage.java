package b.creational.d.factory.method;

public class TextMessage extends Message {
	@Override
	public String contentType() {
		return "text";
	}
}
