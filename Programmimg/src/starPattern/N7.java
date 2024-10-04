package starPattern;
public class N7 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
	    int n=1;
		
		for(int i=0; i<line; i++) {
			int n1 = n;
			for(int j=0; j<star; j++) {
				System.out.print(" "+n1+" ");
				n1++;		
			}
			System.out.println("   ");
			star--;
			n++;
		}	
	}
}

/*
 1  2  3  4    
 2  3  4    
 3  4    
 4  
 */
