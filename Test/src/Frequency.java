import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void charCount(String input) {
		input = input.toLowerCase().replaceAll("\\W+", "");
		if (input.isEmpty() || input.isBlank())
			System.out.println("Invalid String");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (!map.containsKey(input.charAt(i)))
				map.put(input.charAt(i), 1);
			else
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
		}
		for (char i : map.keySet()) {
			System.out.println("Frequency Of " + i + " : " + map.get(i));
		}
	}

	public static void main(String[] args) {
		String s = "ghghjgae123aaesrhhgghg";
		charCount(s);
	}
}
