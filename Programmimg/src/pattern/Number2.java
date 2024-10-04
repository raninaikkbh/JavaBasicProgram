package pattern;

/*
 1  1  1  1 
 2  2  2  2 
 3  3  3  3 
 4  4  4  4 
 */

public class Number2 {

	public static void main(String[] args) {
		
		int line = 4;
		int star = 4;
		int ch = 1;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print(" "+ch+" ");	
			}
			System.out.println();
			ch++;	
	}
	}
}
