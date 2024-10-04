package pattern;

/*
 
 *  *  *  *  * 
 *  1  2  3  * 
 *  1  2  3  * 
 *  1  2  3  * 
 *  *  *  *  * 
 
 */

public class Number10 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		int n = 1;
		
		for(int i=0; i<line; i++) { 
			//int n1 = n;
			//int n2 = 1;
					for(int j=0; j<star; j++) {
						
						if(i==0 || j==0 || i==4 || j==4)
						{
							  System.out.print(" * ");
						}
						else 
						{
							System.out.print(" "+n+" ");
						        n++;
						}
//						else if(i==2)
//						{
//							System.out.print(" "+n1+" ");
//						        n1++;
//						}
//						else if(i==3)
//						{
//							System.out.print(" "+n2+" ");
//						        n2++;
//						}
		}
		System.out.println();
		}
	
	}
}

