package MVCAccount.MVC;

import java.util.ArrayList;

public class BankData implements Subject{
	private ArrayList<Observer> observers;
	
	public BankData() {
		observers = new ArrayList(); 
	}
	public void registerObserver(Observer o) { 
		observers.add(o);
	} 	// observer 동적 등록
	public void removeObserver(Observer o) {
		observers.remove(o);
	}	// observer 동적 취소
	public void notifyObservers(String message) { 							// subject 상태 변경 통지
		for (Observer o : observers) o.update(message); 	//	(note) push model
	}
}
