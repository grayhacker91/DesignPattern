package StrategyPattern.Account;

import java.util.Date;

public class SavingBehavior implements WithdrawBehavior {
	int balance;
	Date date;
	public SavingBehavior(int balance,Date date) {
		this.balance=balance;
		this.date=date;
	}
	public void withdraw(int cash) {
		Date now = new Date();
		if(date.getTime()-now.getTime()==0) {
			System.out.println("계약 만료일 입니다.");
			System.out.println((balance-cash)+"만큼 남으셨습니다");
		}
		else {
			System.out.println("계약 만료일이 아닙니다");
			System.out.println("계약 만료일은 "+date.toString());
		}
	}
}
