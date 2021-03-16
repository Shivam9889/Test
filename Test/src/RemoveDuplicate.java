
public class RemoveDuplicate {
	
	static String removeDuplicate(String s) {
		char[] ch=s.toCharArray();
		String op="";
		for(int i=0;i<s.length();i++)
		{
			if(op.indexOf(ch[i])<0)
				op=op+ch[i];
		}
		return op;
	}

	public static void main(String[] args) {
		String s="jhghhgghg";
		System.out.print(removeDuplicate(s));

	}

}
