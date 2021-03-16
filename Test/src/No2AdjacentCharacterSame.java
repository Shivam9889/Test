import java.util.*;

public class No2AdjacentCharacterSame {

	static boolean isPossible(String str) {
		char[] a = str.toCharArray();
		int max_freq = 0;
		int n = a.length;
		Map<Character, Integer> map = new HashMap<>();
		if (str.isBlank() || str.isEmpty())
			return false;
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
				if (map.get(a[i]) > max_freq)
					max_freq = map.get(a[i]);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
				if (map.get(a[i]) > max_freq)
					max_freq = map.get(a[i]);
			}
		}
		if (max_freq <= (n - max_freq + 1)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		String str = "abba";
		System.out.println(isPossible(str));
	}
}
