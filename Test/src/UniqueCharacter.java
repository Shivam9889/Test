
public class UniqueCharacter {

	static char uniqueCharacter(String s) {
		s=s.replaceAll("\\W+","").toLowerCase();
		if (s.isEmpty() || s.isBlank())
			return '-';
		boolean unique;
		for (int i = 0; i < s.length(); i++) {
			unique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && (s.charAt(i)) == (s.charAt(j))) {
					unique = false;
					break;
				}
			}
			if (unique)
				return s.charAt(i);
		}
		return 0;
	}

	public static void main(String[] args) {
		String s="cacacacb";
		char c=uniqueCharacter(s);
		if(c!=0)
		System.out.print("Unique Character is " + c);
		else
			System.out.print("No Unique Character");
		
	}

}
