package MVCAccount.MVC;

public class AccountController {
	private CustomerInfo info;
	
	public AccountController(CustomerInfo i) {
		this.info = i;
	}
	
	public void executiveWithdraw(int cash, int number) {
		info.getAccount(number).withdraw(cash);;
	}
	
	public void executiveDeposit(int cash, int number) {
		info.getAccount(number).deposit(cash);
	}
}
