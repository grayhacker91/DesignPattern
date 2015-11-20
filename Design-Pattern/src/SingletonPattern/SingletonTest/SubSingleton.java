package SingletonPattern.SingletonTest;

public class SubSingleton {
	protected static SubSingleton uniqueInstance;
	protected SubSingleton() {}
 
	public static synchronized SubSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SubSingleton();
		}
		return uniqueInstance;
	}
}
