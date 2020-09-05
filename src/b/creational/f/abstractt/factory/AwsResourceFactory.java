package b.creational.f.abstractt.factory;

import b.creational.f.abstractt.factory.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {
	@Override
	public Instance createInstance(Capacity capacity) {
		return new EC2Instance(capacity);
	}

	@Override
	public Storage createStorage(int storageSize) {
		return new S3Storage(storageSize);
	}

}
