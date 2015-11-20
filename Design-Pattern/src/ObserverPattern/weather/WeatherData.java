package ObserverPattern.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers; 		// observer list
	private float 온도, 습도, 기압, 풍속; 			// subject 상태

	public WeatherData() {
		observers = new ArrayList(); 
	}

	public void registerObserver(Observer o) { 
		observers.add(o); 
	} 	// observer 동적 등록
	public void removeObserver(Observer o) {
		observers.remove(o);
	}				// observer 동적 취소
	public void notifyObservers() { 							// subject 상태 변경 통지
		for (Observer o : observers) o.update(온도, 습도, 기압, 풍속); 	//	(note) push model
	} 

	public void setMeasurements(float t, float h, float p, float w) { // 기상대가 호출함
		온도 = t; 습도 = h; 기압 = p;  풍속 = w;
		measurementsChanged();
	}
	public void measurementsChanged() { // observer들에게 변경 사항을 통지함
		notifyObservers(); 
	}
}
