package b.creational.f.abstractt.factory;

public class GoogleComputingEngineInstance implements Instance {

	public GoogleComputingEngineInstance(Capacity capacity) {
		System.out.println("Created Google Computing Engine instance");
	}

	@Override
	public void start() {
		System.out.println("Spinning google computing engine instance..");
	}

	@Override
	public void stop() {
		System.out.println("Shutting google computing engine instance down..");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to Google Computing Engine instance..");
	}

}
