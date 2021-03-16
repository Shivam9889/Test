
public class Subsequence {
	
	static boolean isSubsequence(String str1,String str2 , int a,int b) {
		int j=0;
		for(int i=0;i<b && j<a;i++) {
			if(str1.charAt(j)==str2.charAt(i))
				j++;
		}
		return j==a;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("abdc", "aaabbdc",4,7));
	}

}
