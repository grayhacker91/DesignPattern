package SingletonPattern.SingletonTest;

public class SingletonTestDrive {
	public static void main(String[] args) {
		
		System.out.println("Classic Singleton Test");
		ClassicSingleton classic1 = ClassicSingleton.getInstance();
		ClassicSingleton classic2 = ClassicSingleton.getInstance();
		System.out.println(classic1);
		System.out.println(classic2+"\n");
		
		System.out.println("Synchronized Singleton Test");
		SyncSingleton Sync1 = SyncSingleton.getInstance();
		SyncSingleton Sync2 = SyncSingleton.getInstance();
		System.out.println(Sync1);
		System.out.println(Sync2+"\n");
		
		System.out.println("Double-checking Singleton Test");
		DoubleSingleton Double1 = DoubleSingleton.getInstance();
		DoubleSingleton Double2 = DoubleSingleton.getInstance();
		System.out.println(Double1);
		System.out.println(Double2+"\n");
		
		System.out.println("Eage Singleton Test");
		EagerSingleton Eager1 = EagerSingleton.getInstance();
		EagerSingleton Eager2 = EagerSingleton.getInstance();
		System.out.println(Eager1);
		System.out.println(Eager2+"\n");
		
		System.out.println("Static Block Singleton Test");
		BlockSingleton Block1 = BlockSingleton.getInstance();
		BlockSingleton Block2 = BlockSingleton.getInstance();
		System.out.println(Block1);
		System.out.println(Block2+"\n");
		
		System.out.println("SubClass Singleton Test");
		SubSingleton Sub1 = CoolerSingleton.getInstance();
		SubSingleton Sub2 = HotterSingleton.getInstance();
		System.out.println(Sub1);
		System.out.println(Sub2+"\n");
		
		System.out.println("Multi Singleton Test");
		MultiSingleton.setCnt(2);
		MultiSingleton multi1 = MultiSingleton.getInstance();
		MultiSingleton multi2 = MultiSingleton.getInstance();
		MultiSingleton multi3 = MultiSingleton.getInstance();
		System.out.println(multi1);
		System.out.println(multi2);
		System.out.println(multi3+"\n");
	}
}