package MVCAccount.MVC;

import java.util.ArrayList;

public class CustomerInfo {
	private ArrayList<Account> accounts;
	public CustomerInfo() {
		accounts = new ArrayList<Account>();
	}
	
	public void registerCustomer(Account a) { 
		accounts.add(a);
	}
	
	public Account getAccount(int cnt) {
		return accounts.get(cnt);
	}
}
