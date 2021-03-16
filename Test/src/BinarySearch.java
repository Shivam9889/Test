
public class BinarySearch {
	static int binarySearch(int[] a, int l, int r, int x) {
		if (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == x)
				return mid;
			if (x < a[mid])
				return binarySearch(a, l, mid - 1, x);
			if (x > a[mid])
				return binarySearch(a, mid + 1, r, x);
		} 
			return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int x = 9;
		int l = 0;
		int r = a.length - 1;
		System.out.print("Index of " + x + " is " + binarySearch(a, l, r, x));

	}

}
