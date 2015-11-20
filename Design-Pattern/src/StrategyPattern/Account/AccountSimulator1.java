package StrategyPattern.Account;

public class AccountSimulator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account normal = new Normal();
		Account saving = new Saving(2020,1,1,0,0,0);
		Account minus = new Minus('A');
		
		normal.deposit(10000);
		normal.withdraw(20000);
		normal.withdraw(5000);
		
		saving.deposit(20000);
		saving.withdraw(20000);
		
		minus.deposit(50000);
		minus.withdraw(60000);
	}

}
