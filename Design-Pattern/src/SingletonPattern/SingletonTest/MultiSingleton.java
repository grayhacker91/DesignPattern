package SingletonPattern.SingletonTest;

public class MultiSingleton {
	private static MultiSingleton multiInstance;
	private static int limit=1;
	private static int count=0;
	 
	private MultiSingleton() {}
 
	public static MultiSingleton getInstance() {
		if (count < limit) {
			multiInstance = new MultiSingleton();
			count++;
		}
		return multiInstance;
	}
	
	public static void setCnt(int cnt) {
		limit=cnt;
	}
}
