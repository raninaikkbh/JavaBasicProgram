package alphabetPattern;

/*
 1  2  3  4 
 2  4  6  8 
 3  6  9  12 
 4  8  12  16 
 */

public class P5 {

	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int n1 = 1;
		for(int i=0; i<line; i++) {
			int n2 = n1;
			for(int j=0; j<star; j++) {
				System.out.print(" "+n2+" ");
				n2 += n1;
			}
			System.out.println();
			n1++;
		}	
	}
}

