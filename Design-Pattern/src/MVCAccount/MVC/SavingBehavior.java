package MVCAccount.MVC;

import java.util.Date;

public class SavingBehavior implements WithdrawBehavior {
	int balance;
	Date date;
	public SavingBehavior(int balance,Date date) {
		this.balance=balance;
		this.date=date;
	}
	public void withdraw(Subject BankData, int cash) {
		Date now = new Date();
		if(date.getTime()-now.getTime() <= 0) {
			BankData.notifyObservers("출금액 : " + cash + " 잔고 : " + (balance-cash));
		}
		else {
			BankData.notifyObservers("계약 만료일은 "+date.toString());
		}
	}
}
