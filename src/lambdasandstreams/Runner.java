package lambdasandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		String testString = "This is a string with some words in";
		
		names.add("Bob");
		names.add("Bill");
		names.add("Richard");
		names.add("David");
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);

		
		names.forEach(name -> System.out.println(name));
		
		// saving a lambda that we can reuse
		//Multiply multi = (a, b) -> System.out.println(a * b);
		
		doMultiplication(10, 5, 20, (a, b, c) -> System.out.println(a * b * c));
		
		List<Integer> timesTwoInts = nums.stream().map(num -> num * 2).collect(Collectors.toList());
		
		List<Integer> numsDivisibleBy4 = nums.stream()
				.map(num -> num * 2)
				.filter(num -> num % 4 != 0)
				.collect(Collectors.toList());
		
		int allNumsAdded = nums.stream().reduce((currentVal, acculamtedValue) -> currentVal + acculamtedValue).get();
		
		System.out.println(allNumsAdded);
		
		
		timesTwoInts.forEach(n -> System.out.println(n));
		System.out.println("/n==================================/n");
		numsDivisibleBy4.forEach(n -> System.out.println(n));
		System.out.println("/n==================================/n");
		
		
		
		
		String alteredString = Stream.of(testString.split(" ")).map(str -> str + "!").collect(Collectors.joining());
		
		System.out.println(alteredString);
	}
	
	public static void doMultiplication(int a, int b, int c, Multiply multi) {
		multi.multiply(a, b, c);
	}

}
