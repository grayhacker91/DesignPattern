package ObserverPattern.weather;

public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature, humidity, pressure, wind;
	private Subject weatherData; // “탈퇴”시 사용

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p, float w) {
		temperature = t;
		humidity = h;
		pressure = p;
		wind = w;
		display();
	}
	public void display() {
		System.out.println("forecast Display" + temperature + "F degrees and " + humidity + "% humidity" + pressure + " pressure"+ wind + "wind");
	}
}
