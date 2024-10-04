package alphabetPattern;

public class PS7 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int n1 = 4;
		
		for(int i=0; i<line; i++) { 
			int n2 = n1;
					for(int j=0; j<star; j++) 
					{
						System.out.print(" "+ n2+" ");
						n2--;
						
						if(n2<0)
						{
							n2 = 0;
						}	
					}
					System.out.println();
					n1--;
	}

	}
}


/*
4  3  2  1 
3  2  1  0 
2  1  0  0 
1  0  0  0 
*/

