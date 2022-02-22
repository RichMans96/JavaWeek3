package SOLID.dependencyinversion;

public class Email implements Alert {
	
	@Override
	public String generateWeatherAlert(String weather) {
		if(weather.equals("Raining")) {
	        String alert = "It is " + weather;
	        return alert;
		}
		return null;
    }
	
}
