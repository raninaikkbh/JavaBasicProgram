package alphabetPattern;

/*
 A  *  C  *  E 
 A  *  C  *  E 
 A  *  C  *  E 
 A  *  C  *  E 

 */
public class P2 {

	public static void main(String[] args) {
		int line = 4;
		int star = 5;
		char ch1 = 'A';
		
		for(int i=0; i<line; i++) { 
			for(int j=0; j<star; j++) {
				if(j==0) 
				{
				    System.out.print(" " +ch1+" ");	
		    	}
				else if(j==1 || j==3)
				{
					System.out.print(" * ");
				}
				else if(j==2)
				{
					char ch2 = 'C';
					System.out.print(" "+ch2+" ");
				}
				else
				{
					char ch3 ='E';
					System.out.print(" "+ch3+" ");
				}
				/* if(j%2==0) {
					System.out.print(" "+ch1+" ");
					ch1++;
				}
				else {
					System.out.print(" * ");
				}
				*/
			}
			System.out.println();	
	}
}
}
