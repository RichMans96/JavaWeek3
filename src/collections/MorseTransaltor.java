package collections;

import java.util.HashMap;
import java.util.Map;

public class MorseTransaltor {
	private Map<String, String> morsecode = new HashMap<>();

	public MorseTransaltor() {
		this.morsecode.put(".-", "a");
		this.morsecode.put("-...", "b");
		this.morsecode.put("-.-.", "c");
		this.morsecode.put("-..", "d");
		this.morsecode.put(".", "e");
		this.morsecode.put("..-.", "f");
		this.morsecode.put("--.", "g");
		this.morsecode.put("....", "h");
		this.morsecode.put("..", "i");
		this.morsecode.put(".---", "j");
		this.morsecode.put("-.-", "k");
		this.morsecode.put(".-..", "l");
		this.morsecode.put("--", "m");
		this.morsecode.put("-.", "n");
		this.morsecode.put("---", "o");
		this.morsecode.put(".--.", "p");
		this.morsecode.put("--.-", "q");
		this.morsecode.put(".-.", "r");
		this.morsecode.put("...", "s");
		this.morsecode.put("-", "t");
		this.morsecode.put("..-", "u");
		this.morsecode.put("...-", "v");
		this.morsecode.put(".--", "w");
		this.morsecode.put("-..-", "x");
		this.morsecode.put("-.--", "y");
		this.morsecode.put("--..", "z");
		this.morsecode.put("/", " ");
	}
//                     .--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-
	public String translate(String input) {
		String[] splitInput = input.split(" ");
		String output = "";
		
//		for(int i = 0; i < splitInput.length; i++) {
//			output += morsecode.get(splitInput[i]);
//		}
		
		for(String s : splitInput) {
			output += morsecode.get(s);
		}
		
		return output;
	}

}
