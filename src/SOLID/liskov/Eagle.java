package SOLID.liskov;

public class Eagle extends FlyingBird {

	@Override
	public void fly() {
		super.setAltitude(getAltitude() + 500);
	}

}
