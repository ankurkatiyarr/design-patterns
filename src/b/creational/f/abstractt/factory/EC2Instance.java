package b.creational.f.abstractt.factory;

public class EC2Instance implements Instance {

	public EC2Instance(Capacity capacity) {
		System.out.println("Created EC2 instance");
	}

	@Override
	public void start() {
		System.out.println("Spinning ec2 instance..");
	}

	@Override
	public void stop() {
		System.out.println("Shutting ec2 instance down..");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to EC2 instance..");
	}

}
