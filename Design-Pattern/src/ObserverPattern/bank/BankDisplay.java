package ObserverPattern.bank;

public class BankDisplay implements Observer,DisplayElement {
	private Subject bankData;
	public BankDisplay(Subject bankData) {
		this.bankData=bankData;
		bankData.registerObserver(this);
	}
	public void update(String message) {
		display(message);
	}
	public void display(String message) {
		System.out.println(message);
	}
}
