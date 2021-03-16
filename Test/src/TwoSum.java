import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4,3 , 6};
		System.out.println(Arrays.toString(twosum(a, 7)));
	}

	public static int[] twosum(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if ((input[i] + input[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");

	}

}
