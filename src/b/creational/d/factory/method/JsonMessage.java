package b.creational.d.factory.method;

public class JsonMessage extends Message {
	@Override
	public String contentType() {
		return "json";
	}
}
