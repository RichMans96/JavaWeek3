package lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

	public static void main(String[] args) {
//		Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
//
//		("Michael", "Dean", "James", "Chris")
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
		List<String> rudeToJames = names.stream().map(name -> {
			if(!name.equals("James")) {
				return "hello " + name;
				};
				return name;
			})
			.collect(Collectors.toList());
		
	
		rudeToJames.forEach(n -> System.out.println(n));
		
//		Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).
//
//		(3, 4, 7, 8, 12)
//		Starting with a list of numbers, use streams to do the following:
		List<Integer> nums = Arrays.asList(3, 4, 7, 8, 12);
		
		int product = nums.stream().reduce((a, b) -> a * b).get();
		
		System.out.println("product " + product);
//
//		Find the max value.
		int max = nums.stream().mapToInt(x -> x).max().getAsInt();
		System.out.println(max);
//		Find the min value.
		
		int min = nums.stream().mapToInt(num -> num).min()
				.getAsInt();
		System.out.println(min);
		
//		Remove the odd numbers.
		
		List<Integer> evensOnly = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		evensOnly.forEach(n -> System.out.println(n));
//		Remove the even numbers.
		
		List<Integer> oddsOnly = nums.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
		oddsOnly.forEach(n -> System.out.println(n));
		
//		Find the sum of the list.
		int sum = nums.stream().reduce((a, b) -> a + b).get();
		
		System.out.println("sum " + sum);
		
//		Square every number in the list then remove the even numbers and then find the min value.
		int minOfSquaredNums = nums.stream().map(num -> num * num)
				.filter(num -> num % 2 == 1)
				.mapToInt(num -> num).min()
				.getAsInt();
		System.out.println(minOfSquaredNums);
	}

}
