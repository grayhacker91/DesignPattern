package StrategyPattern.Account;

public class NormalBehavior implements WithdrawBehavior {
	int balance;
	public NormalBehavior(int balance) {
		this.balance=balance;
	}
	public void withdraw(int cash) {
		if(cash <= balance) {
			System.out.println(cash+"만큼 출금하셨습니다");
			System.out.println((balance-cash)+"만큼 출금할 수 있습니다");
		}
		else {
			System.out.println("잔고가 부족합니다");
			System.out.println("잔고는 "+balance);
		}
	}
}
