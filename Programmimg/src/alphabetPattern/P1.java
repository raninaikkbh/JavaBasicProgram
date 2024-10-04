package alphabetPattern;

/*
 
 A  A  A 
 *  *  * 
 C  C  C 
 *  *  * 
 E  E  E 

 */

public class P1 {
	public static void main(String[] args) {
		int line = 5;
		int star = 3;
		char ch1 = 'A';
		
		for(int i=0; i<line; i++) { 
			for(int j=0; j<star; j++) {
				if(i%2==0) {
					System.out.print(" "+ch1+" ");
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println();
			ch1++;
	}
	}
}



