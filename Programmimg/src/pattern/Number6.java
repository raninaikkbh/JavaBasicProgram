package pattern;

/*
 
 1  2  3  4 
 5  6  1  2 
 3  4  5  6 
 1  2  3  4 
 
 */

public class Number6 {

	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int ch = 1;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print(" "+ch+" " );
				ch++;
				if(ch>6) {
					ch=1;
				}
				
			}
			System.out.println();	
		}

	}

}
