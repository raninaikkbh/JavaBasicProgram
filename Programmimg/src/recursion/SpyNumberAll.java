//find the all the Spy number b/w 1 to 100000
package recursion;

public class SpyNumberAll {
	public static void main(String[] args) {
		int sum = 0;
		int mul = 1;
		int a=0;
		
		while(a<10) {
			int r = a%10;
			sum += r;
			mul *= r;
			a=a/10;
		}	
		System.out.println(sum +"     "+mul);
	}

}
