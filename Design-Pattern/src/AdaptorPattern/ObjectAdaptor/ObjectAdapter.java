package AdaptorPattern.ObjectAdaptor;

public class ObjectAdapter implements Duck {
	Turkey turkey;
	public ObjectAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	public void quack() {
		turkey.gobble();
	}
	public void fly() {
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}
}
