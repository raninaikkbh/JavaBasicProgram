package starPattern;

public class N8 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
	    char n='A';
		
		for(int i=0; i<line; i++) {
			char n1 = n;
			for(int j=0; j<star; j++) {
				if(i%2==0)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print(" "+n1+" ");
					n1++;	
				}
			}
			System.out.println("   ");
			star--;
		}	

	}

}
/*
 
 *  *  *  *  *    
 A  B  C  D    
 *  *  *    
 A  B    
 *  
 
 */
