package b.creational.f.abstractt.factory;

public class S3Storage implements Storage {
	
	public S3Storage(int storageSize) {
		System.out.println("Creating S3 with size " + storageSize);
	}

	@Override
	public String getId() {
		return "S3";
	}
}
