package SOLID.liskov;

public class Owl extends FlyingBird {

	@Override
	public void fly() {
		super.setAltitude(getAltitude() + 200);
	}
	
}