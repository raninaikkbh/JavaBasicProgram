package starPattern;

public class N6 {

	public static void main(String[] args) {
		int line = 4;
		int star = 1;
	    int n=4;
		
		for(int i=0; i<line; i++) {
			int n1 = n;
			for(int j=0; j<star; j++) {
				System.out.print(" "+n1+" ");
				n1++;
				
			}
			System.out.println("   ");
			star++;
			n--;
			
		}

	}

}

/*
 4    
 3  4    
 2  3  4    
 1  2  3  4   
 */
