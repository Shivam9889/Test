
public class BreakaPalindrome {

	public static String breakPalindrome(String s) {
		int n = s.length();
		if (n == 1)
			return "";
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != 'a')
				return (s.substring(0, i) + 'a' + s.substring(i + 1));
		}
		return s.substring(0, n-1)+'b';
	}

	public static void main(String[] args) {
		System.out.println(breakPalindrome("aabbaa"));
	}

}
