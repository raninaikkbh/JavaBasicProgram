package starPattern;

public class N2 {

	public static void main(String[] args) {
		int line = 4;
		int star = 1;
		int n = 1;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print(" "+n+" ");				
			}
			System.out.println("   ");
			star++;
			n++;
		}

	}

}
/*
1    
2  2    
3  3  3    
4  4  4  4    
*/