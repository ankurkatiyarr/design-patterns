package b.creational.f.abstractt.factory;

import b.creational.f.abstractt.factory.Instance.Capacity;

public class AbstractFactoryDemo {
	private ResourceFactory resourceFactory;

	public AbstractFactoryDemo(ResourceFactory resourceFactory) {
		this.resourceFactory = resourceFactory;
	}
	
	public Instance createServer(Instance.Capacity capacity, int storageSize) {
		Instance instance = resourceFactory.createInstance(capacity);
		Storage storage = resourceFactory.createStorage(storageSize);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		AbstractFactoryDemo demo = new AbstractFactoryDemo(new AwsResourceFactory());
		Instance awsInstance = demo.createServer(Capacity.MEDIUM, 1024);
		awsInstance.start();
		awsInstance.stop();
	}
}
