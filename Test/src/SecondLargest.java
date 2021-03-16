
public class SecondLargest {

	static int getSecondLargest(int[] a) {
		int first,second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] > second && a[i] != first)
				second = a[i];
		}
		if (second == Integer.MIN_VALUE)
			return 0;
		else
			return second;

	}

	public static void main(String[] args) {
		int[] a = { 8, 8 };
		System.out.println(getSecondLargest(a));
	}

}
