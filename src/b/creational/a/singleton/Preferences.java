package b.creational.a.singleton;

public class Preferences {
	// holder of the single instance for the singleton class
	private static Preferences preferences;
	
	// No other classes can instantiate a singleton
	private Preferences() {}

	/*
     * Create a singleton instance.
     * Use synchronized to allow one one instance when using multiple threads
     */
	private synchronized static void createInstance() {
		if (preferences == null) {
			preferences = new Preferences();
		}
	}
	
	public static Preferences getPreference() {
		if (preferences == null) {
			createInstance();
		}
		return preferences;
	}
}
