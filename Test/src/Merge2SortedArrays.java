import java.util.Arrays;

public class Merge2SortedArrays {

	static int[] merged(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int[] out = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				out[k++] = a[i++];
			else
				out[k++] = b[j++];
		}
		while (i < a.length)
			out[k++] = a[i++];
		while (j < b.length)
			out[k++] = b[j++];
		return out;
	}

	public static void main(String[] args) {
		int a[] = { 6, 8, 22 };
		int b[] = { 1, 2, 3, 7 };
		System.out.println(Arrays.toString(merged(a, b)));
	}
}
