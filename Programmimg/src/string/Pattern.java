package string;

public class Pattern {
	public static void main(String[] args) {
		String str = "PROGRAM";
		
		int line = str.length();
		int star = str.length();
		int ch1 =0;
		
		for(int i=0; i<line; i++) {
			String s = "";
			int ch2 =ch1;
			for(int j=1; j<star; j++) {
				s += str.charAt(ch2++);
				if(ch2 == str.length()) 
					ch2=0;
			}	
			System.out.println(s);
			ch1++;
		}
	}
}

/*
PROGRA
ROGRAM
OGRAMP
GRAMPR
RAMPRO
AMPROG
MPROGR
*/
