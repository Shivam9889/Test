
import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {

	static int highestFrequency(String s) {
		s=s.toLowerCase().replaceAll("\\W+","");
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(ch[i]))
				map.put(ch[i], 1);
			else
				map.put(ch[i], map.get(ch[i]) + 1);
		}
		System.out.println(map);
		int temp = 0;
		char a = ' ';
		for (char i : map.keySet()) {
			if (map.get(i) > temp) {
				temp = map.get(i);
				a = i;
			}
		}
		System.out.print(a);
		return temp;
	}

	public static void main(String[] args) {
		String s = "I am Shivam.";
		System.out.print(highestFrequency(s));

	}

}
