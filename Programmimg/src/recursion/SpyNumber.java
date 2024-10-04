package recursion;

public class SpyNumber {

	public static void main(String[] args) {
		int a = 2114;
		int sum = 0;
		int mul = 1;
		
		while(a!=0) {
			int r = a%10;
			sum += r;
			mul *= r;
			a=a/10;
		}	
		System.out.println(sum +"     "+mul);
	}
}

/* OUTPUT 2+1+1+4 = 8
          2*1*1*4 = 8

8     8

*/