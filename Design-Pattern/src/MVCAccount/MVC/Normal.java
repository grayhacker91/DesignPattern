package MVCAccount.MVC;

public class Normal extends Account {
	public Normal(Subject bankData) {
		this.bankData=bankData;
		bankData.registerObserver(this);
	}
	public void withdraw(int cash) {
		wb = new NormalBehavior(this.getBalance());
		wb.withdraw(bankData,cash);
	}
	public void update(String message) {
		display(message);
	}
	public void display(String message) {
		System.out.println(message);
	}
}
