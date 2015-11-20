package AdaptorPattern.ClassAdaptor;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck adapter = new ClassAdapter();
  
		System.out.println("The Adapter says...");
		adapter.quack();
		adapter.fly();

	}
}
