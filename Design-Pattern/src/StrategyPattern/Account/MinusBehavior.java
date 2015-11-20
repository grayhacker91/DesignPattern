package StrategyPattern.Account;

public class MinusBehavior implements WithdrawBehavior{
	int balance;
	char credit;
	public MinusBehavior(int balance,char credit) {
		this.balance=balance;
		this.credit=credit;
	}
	public void withdraw(int cash) {
		if(credit=='A') {
			if(cash <= balance + 100000) {
				System.out.println("신용등급 : " + credit);
				System.out.println("신용등급에 따라 잔고보다 100000 더 출금 가능합니다");
				System.out.println(cash+"만큼 출금하셨습니다");
				System.out.println((balance+100000-cash)+"만큼 출금할 수 있습니다");
			}
			else {
				System.out.println("잔고가 부족합니다");
			}
		}
		else if(credit=='B') {
			if(cash <= balance + 50000) {
				System.out.println("신용등급 : " + credit);
				System.out.println("신용등급에 따라 잔고보다 50000 더 출금 가능합니다");
				System.out.println(cash+"만큼 출금하셨습니다");
				System.out.println((balance+50000-cash)+"만큼 출금할 수 있습니다");
			}
			else {
				System.out.println("잔고가 부족합니다");
			}
		}
		else if(credit=='C') {
			if(cash <= balance + 10000) {
				System.out.println("신용등급 : " + credit);
				System.out.println("신용등급에 따라 잔고보다 10000 더 출금 가능합니다");
				System.out.println(cash+"만큼 출금하셨습니다");
				System.out.println((balance+10000-cash)+"만큼 출금할 수 있습니다");
			}
			else {
				System.out.println("잔고가 부족합니다");
			}
		}
	}
}
