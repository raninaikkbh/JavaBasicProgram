package pattern;

/*
 
 1 1  1  1  1  
 *  *  *  *  * 
 2  2  2  2  2 
 *  *  *  *  * 
 3  3  3  3  3 

 */

public class Number9 {

	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		int ch = 1;
		
		for(int i = 0; i<line; i++) {
			for(int j=0; j<star; j++) {
				if(i%2==0)
				System.out.print(" "+ch+" ");
				else
					System.out.print(" * ");
			}
			System.out.println();
			if(i%2==0)
			{
			ch++;
		}

	}
	}
}
