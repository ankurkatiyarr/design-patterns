package b.creational.f.abstractt.factory;

public interface ResourceFactory {
	Instance createInstance(Instance.Capacity capacity);
	Storage createStorage(int storageSize);
}
