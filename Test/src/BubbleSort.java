public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 4, 5, 2, 3, 8, 2, 5, 9, 1 };
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + " ");
	}

}
