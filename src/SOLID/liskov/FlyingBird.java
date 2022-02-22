package SOLID.liskov;

public abstract class FlyingBird {
	private int altitude;
	
	public abstract void fly();

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
}
