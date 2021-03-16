import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInteger {

	public static int[] removeDuplicateFromArray(int[] a) {
		if (a.length == 0)
			return new int[] {};
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!set.contains(a[i]))
				set.add(a[i]);
		}
		int count = 0;
		int[] b = new int[set.size()];
		for (int i : set) {
			b[count++] = i;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8 };
		System.out.println(Arrays.toString(removeDuplicateFromArray(a)));
	}

}
