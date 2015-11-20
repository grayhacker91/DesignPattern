package ObserverPattern.weather;

public interface Observer {
	void update(float temp, float humidity, float pressure, float wind);
}
