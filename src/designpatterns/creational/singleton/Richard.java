package designpatterns.creational.singleton;

public final class Richard {
	private static Richard INSTANCE;
	private String greeting;
	private int age;
	
	
	private Richard() {}
	
	public static Richard createRichard() {
		if(INSTANCE == null) {
			INSTANCE = new Richard();
		}
		return INSTANCE;
	}



	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}
