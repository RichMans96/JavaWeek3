package SOLID.openclose.greeters;

public class Greeter {
	
	public Greeter() {}

	public String doGreet(Greet greet) {
		return greet.greeting();
	}
	
}
