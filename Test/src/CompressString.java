public class CompressString {
	public static void compressString(String str) {
		int n = str.length();
	//	String op="";
		for (int i = 0; i < n; i++) {

			// Count occurrences of current character
			int count = 1;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			// Print character and its count
			System.out.print(str.charAt(i));
			System.out.print(count);
			//op=op+str.charAt(i)+count;
		}
		//System.out.println(op);
	}

	public static void main(String[] args) {
		String s = "aaaabbbbccaa";
		compressString(s);

	}

}
