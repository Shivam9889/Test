public class Anagram {
    public static boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
        {
            return false;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count=count+s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            count=count-t.charAt(i);
        }
        return (count==0);
    }
    public static void main(String[] args) {
		String str1 = " ";
		String str2 = " ";
		System.out.print(isAnagram(str1,str2));
	}
}
/*
 * 
 * boolean isAnagramSort(String string1, String string2) { if (string1.length()
 * != string2.length()) { return false; } char[] a1 = string1.toCharArray();
 * char[] a2 = string2.toCharArray(); Arrays.sort(a1); Arrays.sort(a2); return
 * Arrays.equals(a1, a2); }
 * 
 */