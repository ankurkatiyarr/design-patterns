package b.creational.a.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		// Point1: can not create the object of singleton by new.
		// Preferences preferences = new Preferences();

		// Point2: prove singleton
		Preferences preference1 = Preferences.getPreference();
		Preferences preference2 = Preferences.getPreference();
		
		if (preference1 == preference2) { // both should be same because of singleton
			System.out.println("Hence proved..");
		} else {
			System.out.println("Problem with the concept..");
		}
	}
}
