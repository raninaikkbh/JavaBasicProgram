
/*
0  1  0  1  0 
1  0  1  0  1 
0  1  0  1  0 
1  0  1  0  1 
0  1  0  1  0 
*/



package alphabetPattern;

public class P8 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		
		for(int i=0; i<line; i++) { 
					for(int j=0; j<star; j++) 
					{
						System.out.print(" "+ (i+j)%2 +" ");
					}
					System.out.println();			
		}
					
	}
}

