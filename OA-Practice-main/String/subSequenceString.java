
public class subSequenceString {

	public static void main(String[] args) {

		System.out.println(isSubsequence("abdc", "abbdc"));
	}

	static boolean isSubsequence(String A, String B) {
		int pos_A = 0, pos_B = 0;

		while (pos_A < A.length() && pos_B < B.length()) {
			if (A.charAt(pos_A) == B.charAt(pos_B))
				pos_A++;
			pos_B++;
		}
		return pos_A == A.length();
	}
}
