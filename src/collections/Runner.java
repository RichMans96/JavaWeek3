package collections;

public class Runner {

	public static void main(String[] args) {
//		Set<String> mySet = new HashSet<>();
//		
//		mySet.add("Hello");
//		mySet.add("Hi");
//		mySet.add("Bye");
//		mySet.add("Hello");
//		
////		for(String s : mySet) {
////			System.out.println(s);
////		}
////		
//		// Can used for any collections
//		Iterator iterator = mySet.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		Map<String, String> myMap = new HashMap<>();
//		
//		myMap.put("Manchester", "England");
//		myMap.put("Leicester", "England");
//		myMap.put("Brighton", "England");
//		myMap.put("Malaga", "Spain");
//		
//		System.out.println(myMap.get("Manchester"));
//	
		
		
		MorseTransaltor mt = new MorseTransaltor();
		
		System.out.println(mt.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}

}
