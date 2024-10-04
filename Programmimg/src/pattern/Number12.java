package pattern;

/*
 
 *  *  *  *  * 
 *  1  *  3  * 
 *  1  *  3  * 
 *  1  *  3  * 
 *  *  *  *  * 
 
 */

public class Number12 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		int n = 1;
		
		for(int i=0; i<line; i++) { 
			int n1 = 3;
					for(int j=0; j<star; j++) {
						if(i==0 || j==0 || i==4 || j==4 || j==2)
						{
							  System.out.print(" * ");
						}
						else if(j==1)
						{
							System.out.print(" "+n+" ");  
						}
						else if(j==3)
						{
							System.out.print(" "+n1+" ");
						}
		}
		System.out.println();
	    
		}
	}

}
