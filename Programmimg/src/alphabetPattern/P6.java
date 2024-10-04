package alphabetPattern;
/*
 7  6  5  4 
 6  5  4  3 
 5  4  3  2 
 4  3  2  1 

 */
public class P6 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int n1 = 7;
		int n2 = 3;
		
		for(int i=0; i<line; i++) { 
			int n3 = n2;
			 int n4 = n1;
					for(int j=0; j<star; j++) {
						if(i+j>3) {
							System.out.print(" "+ n3+ " " );	
							n3--;
						}else
						{
							System.out.print(" "+n4+" ");
							n4--;
						}	
					}
					System.out.println();
					n1--;
		}

	}
}

