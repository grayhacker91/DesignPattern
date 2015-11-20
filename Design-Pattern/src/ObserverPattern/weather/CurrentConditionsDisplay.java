package ObserverPattern.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature, humidity, wind;
	private Subject weatherData; // “탈퇴”시 사용

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p, float w) {
		temperature = t;
		humidity = h;
		wind = w;
		display();
	}
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" + wind + "wind" );
	}
}
