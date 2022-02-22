package SOLID.dependencyinversion;



public class Runner {
	
	public static void main(String[] args) {
		WeatherTracker wt = new WeatherTracker();
		Alert phone = new Phone();
		Alert email = new Email();
		
		wt.setConditions("Raining");
		
		System.out.println(wt.notify(phone));
	}

}
