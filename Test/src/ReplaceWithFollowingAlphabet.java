import java.util.*;
import java.io.*;

class ReplaceWithFollowingAlphabet {

	public static String replaceWithFollowingAlphabet(String str) {
		// code goes here
		String output = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z')
				output = output + "a";
			else if (str.charAt(i) == 'Z')
				output = output + "A";
			else if (str.charAt(i) >= 97 && str.charAt(i) < 122)
				output = output + (char) (1 + str.charAt(i));
			else
				output = output + str.charAt(i);
		}
		String modified = "";
		for (int i = 0; i < output.length(); i++) {
			if (output.charAt(i) == 'a' || output.charAt(i) == 'e' || output.charAt(i) == 'i' || output.charAt(i) == 'o'
					|| output.charAt(i) == 'u')
				modified = modified + Character.toString(output.charAt(i)).toUpperCase();
			else
				modified = modified + output.charAt(i);
		}

		return modified;
	}

	public static void main(String[] args) {

		String s = "abcdezZ";
		System.out.print(replaceWithFollowingAlphabet(s));
	}

}