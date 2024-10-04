package alphabetPattern;
/*
 4  3  2  1 
 3  2  1  0 
 2  1  0  0 
 1  0  0  0 
 */
public class P7 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int n1 = 4;
		int n2 = 0;
		
		for(int i=0; i<line; i++) { 
			int n3 = n2;
		    int n4 = n1;
					for(int j=0; j<star; j++) {
						if(i+j>3) {
							System.out.print(" "+ n3+ " " );		
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
	