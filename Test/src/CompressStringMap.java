import java.util.*;

public class CompressStringMap {

	static String compressStringMap(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(ch[i]))
				map.put(ch[i], 1);
			else
				map.put(ch[i], map.get(ch[i]) + 1);
		}
		String output = "";
		for (char i : map.keySet()) {
			// System.out.print(i);
			// System.out.print(map.get(i));
			output = output + i + map.get(i);
		}
		return output;
	}

	public static void main(String[] args) {
		String s = "aaaabbbbcc";
		System.out.println(compressStringMap(s));

	}

}
