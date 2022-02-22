package SOLID.liskov.exercise;

public class BedroomAdder {
	
	public void addBedroom(MultiRoomApartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 40);

		apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
	}
}
