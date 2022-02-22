package SOLID.liskov.exercise;

public class Runner {

	public static void main(String[] args) {
		MultiRoomApartment penthouse = new Penthouse();
		Apartment studio = new Studio();
		
		BedroomAdder ba = new BedroomAdder();
		
		
		ba.addBedroom(penthouse);
	}

}
