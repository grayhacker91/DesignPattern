package ObserverPattern.bank;

public class BankStation {
	public static void main(String args[]) {
		BankData bankData = new BankData(); 

		//Observers 생성
		BankDisplay bankDisplay = new BankDisplay(bankData);
		BankDisplay bankDisplay2 = new BankDisplay(bankData);

		bankData.setMeasurements("주택관련 상품이 새로 생겼습니다."); 
		bankData.setMeasurements("대출관련 상품이 새로 생겼습니다.");
	}
}
