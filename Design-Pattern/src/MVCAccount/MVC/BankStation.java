package MVCAccount.MVC;

public class BankStation {
	public static void main(String args[]) {
		BankData bankData = new BankData(); 

		//Observers 생성
		Account normal = new Normal(bankData);
		Account saving = new Saving(bankData,2020,1,1,0,0,0);
		Account minus = new Minus(bankData,'A');
		
		CustomerInfo ci = new CustomerInfo();
		ci.registerCustomer(normal);
		ci.registerCustomer(saving);
		ci.registerCustomer(minus);
		
		//컨트롤러 생성
		AccountController ac = new AccountController(ci);
		
		//입금
		ac.executiveDeposit(10000, 0);
		ac.executiveDeposit(30000, 1);
		ac.executiveDeposit(20000, 2);
		
		ac.executiveWithdraw(5000, 0);
		ac.executiveWithdraw(10000, 1);
		ac.executiveWithdraw(30000, 2);
	}
}
