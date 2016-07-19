package weatherDataTest;

public class CurrentConditionDisplay implements Observer, DisplayElement {
private float temperature;
private float humidity;
private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
	super();
	this.weatherData = weatherData;
    weatherData.registerObserver(this);
}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+this.temperature+"F degrees and"+humidity+"% humidity");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temperature;
		this.humidity=humidity;
		display();

	}

}
