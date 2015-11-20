package StrategyPattern.Account;

public abstract class Account {
	WithdrawBehavior wb;
	int balance=0;
	
	public void deposit(int cash) {
		this.balance += cash;
		System.out.println(balance+"남아있습니다");
	}
	
	public int getBalance() {
		return balance;
	}
	
	abstract void withdraw(int cash);
}
