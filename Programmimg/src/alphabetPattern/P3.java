package alphabetPattern;

/*
 A  B  C  D 
 B  C  D  A 
 C  D  A  B 
 D  A  B  C 
 */
public class P3 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		char ch1 = 'A';
		char ch2 = 'A';
		for(int i=0; i<line; i++) { 
			char ch3 = ch2;
			char ch4 = ch1;
					for(int j=0; j<star; j++) {
						if(i+j>3) {
							System.out.print(" "+ ch3+ " " );	
							ch3++;
						}else
						{
							System.out.print(" "+ch4+" ");
							ch4++;
						}
						
					}
					System.out.println();
	         		ch1++;
		}
	}
}
