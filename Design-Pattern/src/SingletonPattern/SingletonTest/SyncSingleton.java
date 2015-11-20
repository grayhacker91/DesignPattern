package SingletonPattern.SingletonTest;

public class SyncSingleton {
	private static SyncSingleton uniqueInstance;

	private SyncSingleton() {}
 
	public static synchronized SyncSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SyncSingleton();
		}
		return uniqueInstance;
	}

}
