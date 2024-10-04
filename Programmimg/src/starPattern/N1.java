package starPattern;

public class N1 {

	public static void main(String[] args) {
		int line = 4;
		int star = 1;
		
		
		for(int i=0; i<line; i++) {
			int n = 1;
			for(int j=0; j<star; j++) {
				System.out.print(" "+n+" ");
				n++;
			}
			System.out.println("   ");
			star++;
		}

	}

}

/*
 
 1    
 1  2    
 1  2  3    
 1  2  3  4  
   
 */
