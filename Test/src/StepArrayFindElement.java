
public class StepArrayFindElement {

	static int stepArrayFindElement(int[] a, int x) {
		int i = 0;
		while (i < a.length) {
			if (a[i] == x)
				return i;
			else
				i = i + Math.abs(a[i] - x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 5, 6, 5, 4, 3, 2 };
		int x = 2;
		System.out.println(stepArrayFindElement(arr, x));
	}
}
