package a.solid.design.patterns.dip;

public class BPerson {
	public String name;

	public BPerson(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
