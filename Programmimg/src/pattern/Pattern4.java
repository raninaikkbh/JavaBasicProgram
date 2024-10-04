package pattern;
/*
 
 * * * *
 * * * *
 * * * *
 
 */
public class Pattern4 {
	public static void main(String[] args) {
		int line =3;
		int star = 4;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
