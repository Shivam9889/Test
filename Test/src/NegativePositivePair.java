import java.util.LinkedHashSet;
import java.util.Set;

public class NegativePositivePair {

	public static void negativePositivePair(int[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if ((input[i] + input[j]) == 0) {
					set.add(input[i]);
					set.add(input[j]);
				}
			}
		}
		System.out.print(set);
	}

	public static void main(String[] args) {
		int arr[] = { 1, -3, 2, 3, 6, -1, 2 };
		negativePositivePair(arr);

	}

}
