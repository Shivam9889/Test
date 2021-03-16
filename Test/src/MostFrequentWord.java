import java.util.*;

public class MostFrequentWord {
	static String mostCommonWord(String s) {
		String[] words = s.replaceAll("\\W+", " ").toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (!map.containsKey(words[i]))
				map.put(words[i], 1);
			else
				map.put(words[i], map.get(words[i]) + 1);
		}
		int temp = 0;
		String highest = "";
		for (String i : map.keySet()) {
			if (map.get(i) > temp) {
				temp = map.get(i);
				highest = i;
			}
		}
		return highest;
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the far far BALL flew far after it was hit";
		System.out.print(mostCommonWord(paragraph));
	}

}
