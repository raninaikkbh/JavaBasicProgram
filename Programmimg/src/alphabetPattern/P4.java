package alphabetPattern;
/*
 A  B  C  D 
 A  B  C  D 
 A  B  C  D 
 A  B  C  D 

 */
public class P4 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		
		for(int i=0; i<line; i++) { 
			char ch1 = 'A';
					for(int j=0; j<star; j++) {
						System.out.print(" "+ ch1+ " " );	
						ch1++;
					}
					System.out.println();
}
}
}
