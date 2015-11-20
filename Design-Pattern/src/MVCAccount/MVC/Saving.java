package MVCAccount.MVC;

import java.util.Calendar;
import java.util.Date;

public class Saving extends Account {
	Calendar cal;
	public Saving(Subject bankData, int year, int month, int date, int hour, int minute, int second) {
		this.bankData=bankData;
		bankData.registerObserver(this);
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
	
	public void withdraw(int cash) {
		wb = new SavingBehavior(this.getBalance(),this.getDate());
		wb.withdraw(bankData,cash);
	}
	
	public void update(String message) {
		display(message);
	}
	public void display(String message) {
		System.out.println(message);
	}
}
