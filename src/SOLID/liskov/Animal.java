package SOLID.liskov;

public class Animal {
	
	public void learnToFly(FlyingBird bird){
		bird.fly();
    }
	
	public void notFly(FlightlessBird bird) {
		bird.waddle();
	}
}
