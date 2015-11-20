package SingletonPattern.SingletonTest;

public class BlockSingleton {
	  private static final BlockSingleton instance;

	  static { //static block
		try { //예외처리 가능
			instance = new BlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("error", e);
		}
	  }

	  public static BlockSingleton getInstance() {
		return instance;
	  }

	  private BlockSingleton() { }
}
