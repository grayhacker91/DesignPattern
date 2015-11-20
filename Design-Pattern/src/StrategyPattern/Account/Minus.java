package StrategyPattern.Account;

public class Minus extends Account {
	char credit;
	public Minus(char credit) {
		this.credit=credit;
	}
	void withdraw(int cash) {
		wb = new MinusBehavior(this.getBalance(),credit);
		wb.withdraw(cash);
	}
}
