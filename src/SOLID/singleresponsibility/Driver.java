package SOLID.singleresponsibility;


public class Driver {

//	//has a
//	private Car car;
//	
//	public Driver(Car car) {
//		this.car = car;
//	}
	
	// functionality
	public void drive(Car car, int milesDriven) {
		car.setMileage(car.getMileage() + milesDriven);
	}
	
}
