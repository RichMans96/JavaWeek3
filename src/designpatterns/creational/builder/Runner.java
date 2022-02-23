package designpatterns.creational.builder;

public class Runner {

	public static void main(String[] args) {
		Person person1 = new Person
				.PersonBuilder("Richard", "Mansworth")
				.age(0)
				.build();

		System.out.println(person1.getFname());
		System.out.println(person1.getAddress());
	}

}
