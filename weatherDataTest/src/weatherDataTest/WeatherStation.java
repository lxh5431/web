package weatherDataTest;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionDisplay currentDisplay=new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.5f);
		weatherData.setMeasurements(83, 55, 29.7f);
		weatherData.setMeasurements(78 , 90, 34.2f);
		
	}

}
