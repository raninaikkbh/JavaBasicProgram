package pattern;

/*
 
 *  *  *  *  * 
 *  1  1  1  * 
 *  *  *  *  * 
 *  3  3  3  * 
 *  *  *  *  * 
 
 */

public class Number7 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		
		for(int i=0; i<line; i++) { 
					for(int j=0; j<star; j++) {
						int n=1;
						int n2=3;
						if(i==0 || j==0 || i==4 || j==4 || i==2)
						{
							  System.out.print(" * ");
						}
						else if(i==1 )
						{
							System.out.print(" "+n+" ");
						}
						else if (i==3)
						{
							System.out.print(" "+n2+" ");
						}
							
						else 
					{
						System.out.print("   ");
				}
		}
		System.out.println();
		}
	}

}
