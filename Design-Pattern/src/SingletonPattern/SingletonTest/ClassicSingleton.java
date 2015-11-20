package SingletonPattern.SingletonTest;

public class ClassicSingleton {
	private static ClassicSingleton uniqueInstance;
 
	private ClassicSingleton() {}
 
	public static ClassicSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ClassicSingleton();
		}
		return uniqueInstance;
	}
}
