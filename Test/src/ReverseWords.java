public class ReverseWords {

	public static void main(String[] args) {
		String name = "My Name is Swapnil";
		String[] word = name.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + ' ');
		}
	}

}