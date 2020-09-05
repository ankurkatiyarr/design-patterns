package b.creational.f.abstractt.factory;

import b.creational.f.abstractt.factory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputingEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int storageSize) {
		return new GoogleCloudStorage(storageSize);
	}

}
