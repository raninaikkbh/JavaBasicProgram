package string;
//Find out the Capital Letter inside the string

public class CapitalLetter {
	public static void main(String[] args) {
		String str = "CoreJava";
		
		for(int i=0; i<str.length(); i++) {
			int a = str.charAt(i);
			if(a<97)
				System.out.println((char)a);
		}
	}
}

/* Out put
C
J
*/