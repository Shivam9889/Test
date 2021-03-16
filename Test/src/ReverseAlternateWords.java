public class ReverseAlternateWords {
	static void reverseAlternateWords(String s) {
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) {
				reverse(str[i]);
			} else
				System.out.print(str[i] + " ");
		}
	}

	static void reverse(String rev) {
		for (int i = rev.length() - 1; i >= 0; i--)
			System.out.print(rev.charAt(i));
		System.out.print(" ");
	}

	public static void main(String[] args) {
		String s = "I am Shivam Chandra";
		reverseAlternateWords(s);
	}
}
