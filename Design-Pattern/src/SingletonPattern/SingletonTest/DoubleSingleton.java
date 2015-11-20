package SingletonPattern.SingletonTest;

public class DoubleSingleton {
	private volatile static DoubleSingleton uniqueInstance;
	 
	private DoubleSingleton() {}
 
	public static DoubleSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
