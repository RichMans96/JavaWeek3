package exceptions;

public class Runner {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		try {
			System.out.println(calc.multiply(10, 5));
		} catch(TimesByFiveException e) {
			System.out.println(e);
		} catch(ArithmeticException e) {
			
		} catch(RuntimeException e) {
			
		} finally {
			System.out.println("This always runs");
		}

	}

}
