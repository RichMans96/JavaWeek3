package SOLID.singleresponsibility;

public class Car {
	private String colour;
	private String model;
	private int mileage;

	// constructor
	public Car(String colour, String model, int mileage) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}

	// getters and setters for colour and model

	// getter for mileage
	public int getMileage() {
		return mileage;
	}

	// setter for mileage
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	
}
