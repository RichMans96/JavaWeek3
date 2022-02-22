package SOLID.dependencyinversion;

public class WeatherTracker {
	private String conditions;

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String notify(Alert alerter) {
		return alerter.generateWeatherAlert(conditions);
	}

	public String getConditions() {
		return conditions;
	}
}
