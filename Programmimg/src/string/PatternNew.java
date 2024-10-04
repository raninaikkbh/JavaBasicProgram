package string;

public class PatternNew {
	public static void main(String[] args) {
		int line = 5;
		int star = 1;
		char ch1 = 'V';
		for(int i=0; i<line; i++) {
			char ch2 = ch1;
			for(int j=0; j<star; j++) 
			{
				System.out.print(" "+ch2+" ");
				if(i-1==j) 
				{
					ch2--;
				}
			}
			System.out.println();
			ch1++;
			star++;	
		}
	}
}
/* New Pattern 
 
V 
W  V 
X  X  W 
Y  Y  Y  X 
Z  Z  Z  Z  Y 

*/