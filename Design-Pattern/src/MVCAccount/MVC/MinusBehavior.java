package MVCAccount.MVC;

public class MinusBehavior implements WithdrawBehavior{
	int balance;
	char credit;
	public MinusBehavior(int balance,char credit) {
		this.balance=balance;
		this.credit=credit;
	}
	public void withdraw(Subject BankData, int cash) {
		if(credit=='A') {
			if(cash <= balance + 100000) {
				BankData.notifyObservers("신용등급 : " + credit + " 출금액 : " + cash + " 잔고 : " + (balance-cash));
			}
			else {
				BankData.notifyObservers("잔고가 부족합니다");
			}
		}
		else if(credit=='B') {
			if(cash <= balance + 50000) {
				BankData.notifyObservers("신용등급 : " + credit + " 출금액 : " + cash + " 잔고 : " + (balance-cash));
			}
			else {
				BankData.notifyObservers("잔고가 부족합니다");
			}
		}
		else if(credit=='C') {
			if(cash <= balance + 10000) {
				BankData.notifyObservers("신용등급 : " + credit + " 출금액 : " + cash + " 잔고 : " + (balance-cash));
			}
			else {
				BankData.notifyObservers("잔고가 부족합니다");
			}
		}
	}
}
