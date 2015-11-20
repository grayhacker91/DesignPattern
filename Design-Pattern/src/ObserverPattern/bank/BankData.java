package ObserverPattern.bank;

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
	public void setMeasurements(String message) { 
		measurementsChanged(message);
	}
	public void measurementsChanged(String message) { // observer들에게 변경 사항을 통지함
		notifyObservers(message); 
	}
}
