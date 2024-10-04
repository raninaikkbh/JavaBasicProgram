package starPattern;

public class N10 {
	public static void main(String[] args) {
		int line = 5;
		int star = 1;
	    int n=1;
		
		for(int i=0; i<line; i++) {
			int n1=n;
			for(int j=0; j<star; j++) {
				System.out.print(" * ");
					if(i>2)
					{
						System.out.print(" * ");
						
					}
					else {
						System.out.print(" "+n1+" ");
						n1--;	
					}
		}	
			System.out.println("   ");
			star++;
			n++;
	}
	}
}

