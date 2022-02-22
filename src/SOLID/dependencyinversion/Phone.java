package SOLID.dependencyinversion;

public class Phone implements Alert {
	@Override
    public String generateWeatherAlert(String weather) {
		if(weather.equals("Sunny")) {
	        String alert = "It is " + weather;
	        return alert;
		}
		return null;
    }

}
