package exceptions;

public class Calculator {

	public double multiply(double a, double b) throws TimesByFiveException {
		if(b == 5 || a == 5) {
			throw new TimesByFiveException("Can't times by five");
		}
		return a * b;
		
	}
	
	
}
