package pattern;

/*
 1  2   3   4 
 5  6   7   8 
 9  10  11  12 
 13 14  15  16 
 */

public class Number5 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int ch1 = 1;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print(" "+ch1+" " );
				ch1++;	
			}
			System.out.println();	
		}
	}
}
