import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		String s = "yujhhjjbjhjn";
		char[] ch = s.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (char i : ch) {
			if (!set.contains(i))
				set.add(i);
		}
		for (char i : set) {
			System.out.print(i);
		}
		System.out.println();
	}

}
