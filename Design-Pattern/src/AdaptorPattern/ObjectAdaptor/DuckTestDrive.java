package AdaptorPattern.ObjectAdaptor;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck adapter = new ObjectAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		duck.quack();
		duck.fly();
  
		System.out.println("\nThe Adapter says...");
		adapter.quack();
		adapter.fly();

	}
}
