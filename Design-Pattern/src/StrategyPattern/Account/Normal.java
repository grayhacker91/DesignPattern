package StrategyPattern.Account;

public class Normal extends Account {
	public Normal() {
	}
	void withdraw(int cash) {
		wb = new NormalBehavior(this.getBalance());
		wb.withdraw(cash);
	}
}
