package ObserverPattern.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature, humidity, pressure, wind;
	private Subject weatherData; // “탈퇴”시 사용

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p, float w) {
		temperature = t;
		humidity = h;
		pressure = p;
		wind  = w;
		display();
	}
	public void display() {
		System.out.println("Statistics Display" + temperature + "F degrees and " + humidity + "% humidity" + pressure + " pressure" + wind + "wind");
	}
}
