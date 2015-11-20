package MVCAccount.MVC;

public abstract class Account implements Observer {
	protected WithdrawBehavior wb;
	protected int balance=0;
	protected Subject bankData;
	
	public void deposit(int cash) {
		this.balance += cash;
		bankData.notifyObservers("잔고 : " + balance);
	}
	
	public int getBalance() {
		return balance;
	}
	
	abstract void withdraw(int cash);
}
