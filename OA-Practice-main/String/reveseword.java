import java.util.Arrays;

public class reveseword {

	public static void main(String[] args) {
		String name = "  hello world  ";
		
		
		String[] word = name.trim().split(" ");

		System.out.println(Arrays.toString(word));
		for (int i = word.length - 1; i >= 0; i--) {
			if (i == 0)
				System.out.print(word[i]);
			else
				System.out.print(word[i] + ' ');
		}
	}
}
