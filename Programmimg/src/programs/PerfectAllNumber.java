package programs;

public class PerfectAllNumber {

	public static void main(String[] args) {
		for(int j=1; j<=100; j++)
		{
			int a = j;
			int sum = 0;
				for(int i=1; i<a; i++)
				if(a%i==0) {
					sum+=i;
				}
				if(a==sum) {
					System.out.println(a);
				}
			}
			}
	}

/* output
6
28
*/