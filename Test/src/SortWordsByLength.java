public class SortWordsByLength {
	static void sortWords(String s) {
		String[] words = s.replaceAll("\\W+", " ").toLowerCase().split(" ");
		String temp=null;
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = 0; j < words.length - i - 1; j++) {
				if (words[j].length()>words[j + 1].length()) {
					temp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < words.length; i++)
			System.out.print(words[i] + " ");
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the far far BALL flew far after it was hit.";
		sortWords(paragraph);
	}
}