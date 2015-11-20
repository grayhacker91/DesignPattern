package StrategyPattern.Account;

import java.util.Calendar;
import java.util.Date;

public class Saving extends Account {
	Calendar cal;
	public Saving(int year, int month, int date, int hour, int minute, int second) {
		setDate(year,month,date,hour,minute,second);
	}
	
	public void setDate(int year, int month, int date, int hour, int minute, int second) {
		cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
	}
	
	public Date getDate() {
		return cal.getTime();
	}
	
	void withdraw(int cash) {
		wb = new SavingBehavior(this.getBalance(),this.getDate());
		wb.withdraw(cash);
	}
}
