package SOLID.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("red", "Ford", 0);
		Driver driver = new Driver();
		
		driver.drive(car, 5000);
		
		System.out.println(car.getMileage());
		
		driver.drive(car, 5000);
		
		System.out.println(car.getMileage());
	}

}
