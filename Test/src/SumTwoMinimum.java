import java.util.HashSet;
import java.util.Set;

public class SumTwoMinimum {

	static void sumTwoMinimum(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (int i : a)
			if (!set.contains(i))
				set.add(i);
		int first, second;
		first = second = Integer.MAX_VALUE;
		for (int i : set) {
			if (i < first) {
				second = first;
				first = i;
			} else if (i < second && i != first)
				second = i;
		}
		System.out.println(first + "+" + second + " " + (first + second));
	}

	public static void main(String[] args) {
		int[] a = { -1, 0, -1 };
		sumTwoMinimum(a);
	}

}
