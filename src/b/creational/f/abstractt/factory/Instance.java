package b.creational.f.abstractt.factory;

public interface Instance {
	enum Capacity {
		SMALL, MEDIUM, LARGE
	};
	
	void start();
	void stop();
	void attachStorage(Storage storage);
}
