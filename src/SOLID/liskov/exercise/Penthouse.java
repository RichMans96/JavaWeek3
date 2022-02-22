package SOLID.liskov.exercise;

public class Penthouse extends MultiRoomApartment   {
	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.setSquareFootage(this.getSquareFootage());
	}
}
