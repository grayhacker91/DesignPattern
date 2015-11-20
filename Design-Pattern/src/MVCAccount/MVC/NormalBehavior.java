package MVCAccount.MVC;

public class NormalBehavior implements WithdrawBehavior {
	int balance;
	public NormalBehavior(int balance) {
		this.balance=balance;
	}
	public void withdraw(Subject BankData, int cash) {
		if(cash <= balance) {
			BankData.notifyObservers("출금액 : " + cash + " 잔고 : " + (balance-cash));
		}
		else {
			BankData.notifyObservers("잔고가 부족합니다");
		}
	}
}
