package SOLID.openclose;

import SOLID.openclose.greeters.CasualGreeting;
import SOLID.openclose.greeters.FormalGreeting;
import SOLID.openclose.greeters.Greet;
import SOLID.openclose.greeters.Greeter;
import SOLID.openclose.greeters.StandardGreeting;

public class Runner {

	public static void main(String[] args) {
//		AreaCalculator ac = new AreaCalculator();
//		Circle circle = new Circle();
//		Rectangle rec = new Rectangle();
//		
//		
//		circle.setRadius(2);
//		rec.setLength(5);
//		rec.setWidth(3);
//		
//		System.out.println(ac.calculatorAreas(rec));
//		System.out.println(ac.calculatorAreas(circle));
	Greet casualGreeting = new CasualGreeting();
	Greet formalGreeting = new FormalGreeting();
	Greet standardGreeting = new StandardGreeting();
	
	Greeter greeter = new Greeter();
	
	System.out.println(greeter.doGreet(casualGreeting));
	
	}

}
