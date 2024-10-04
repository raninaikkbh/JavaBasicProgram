package recursion;

public class Armstrong {
	public static void main(String[] args) {
		for(int j=1; j<100000; j++) {
			int a = j;
			int temp = a;
			int dCount = 0;
			while(temp!=0) 
			{
				temp/=10;
				dCount++;
			}
			int sum = 0;
			while(a!=0) {
				int r = a%10;
				int pow = 1;
				for(int i=0; i<dCount; i++)
					pow*=r;
				sum = sum+pow;
				a/=10;
			}
			if(sum ==j)
				System.out.println(sum);
		}
	}
}
/*
 1
2
3
4
5
6
7
8
9
153
370
371
407
1634
8208
9474
54748
92727
93084
*/
