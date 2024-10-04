package starPattern;

public class N9 {

	public static void main(String[] args) {
		int line = 4;
		int star = 1;
	    int ch1=1;
		
		for(int i=0; i<line; i++) {
			int ch2=ch1;
			int n = 3;
			for(int j=0; j<star; j++) {
				System.out.print(" "+ch2+" ");
				ch2+=n;	
				n--;
				
			}
			System.out.println("   ");
			star++;
			ch1++;
		}	
	}

}

/*
 1    
 2  5    
 3  6  8    
 4  7  9  10    
*/
