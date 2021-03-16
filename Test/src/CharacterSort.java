public class CharacterSort {
	static void characterSort(String str) {
		char[] s=str.replaceAll("\\W+","").toLowerCase().toCharArray();
		char temp;
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j] > s[j + 1]) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		System.out.print(s);
	}

	public static void main(String[] args) {
		String str = "Shivamhh jhjhj";
		characterSort(str);
	}

}