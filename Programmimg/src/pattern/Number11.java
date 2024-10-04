package pattern;

/*
 
 *  *  *  *  * 
 *  1  1  1  * 
 *  2  2  2  * 
 *  3  3  3  * 
 *  *  *  *  * 
 
 */

public class Number11 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		int n = 1;
		
		for(int i=0; i<line; i++) { 
			int n1 = 2;
			int n2 = 3;
					for(int j=0; j<star; j++) {
						
						if(i==0 || j==0 || i==4 || j==4)
						{
							  System.out.print(" * ");
						}
						else if(i==1)
						{
							System.out.print(" "+n+" ");
						    
						}
						else if(i==2)
						{
							System.out.print(" "+n1+" ");
						      
						}
						else if(i==3)
						{
							System.out.print(" "+n2+" ");
						      
						}
		}
		System.out.println();
	    
		}

	}

}
