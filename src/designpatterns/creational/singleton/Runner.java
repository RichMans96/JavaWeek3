package designpatterns.creational.singleton;

public class Runner {

	public static void main(String[] args) {
		Richard singletonR = Richard.createRichard();
		singletonR.setAge(25);
		singletonR.setGreeting("Hello");
		System.out.println(singletonR.getAge());
		System.out.println(singletonR.getGreeting());
		singletonR.setAge(26);
		Richard otherRichard = Richard.createRichard();
		
		System.out.println(otherRichard.getAge());
		System.out.println(otherRichard.getGreeting());
		otherRichard.setAge(25);
		System.out.println(otherRichard.getAge());
		System.out.println(singletonR.getAge());
	}

}
