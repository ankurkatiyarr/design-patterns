package b.creational.f.abstractt.factory;

public class GoogleCloudStorage implements Storage {
	
	public GoogleCloudStorage(int storageSize) {
		System.out.println("Creating Google Cloud Storage with size " + storageSize);
	}

	@Override
	public String getId() {
		return "GoogleCloud";
	}
}
