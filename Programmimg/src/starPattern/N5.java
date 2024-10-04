package starPattern;

public class N5 {

	public static void main(String[] args) {
		int line = 4;
		int star = 1;
	    int n=1;
		
		for(int i=0; i<line; i++) {
			int n1 = n;
			for(int j=0; j<star; j++) {
				System.out.print(" "+n1+" ");
				n1++;
				
			}
			System.out.println("   ");
			star++;
			n++;
			
		}

	}

}
/*
 
 1    
 2  3    
 3  4  5    
 4  5  6  7  
   
 */
