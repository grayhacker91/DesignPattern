package MVCAccount.MVC;

public class Minus extends Account {
	char credit;
	public Minus(Subject bankData, char credit) {
		this.credit=credit;
		this.bankData=bankData;
		bankData.registerObserver(this);
	}
	public void withdraw(int cash) {
		wb = new MinusBehavior(this.getBalance(),credit);
		wb.withdraw(bankData,cash);
	}
	public void update(String message) {
		display(message);
	}
	public void display(String message) {
		System.out.println(message);
	}
}
