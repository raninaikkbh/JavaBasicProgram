package recursion;

public class ReverseNo {
	public static void main(String[] args) {
		int a = 2453;
		int sum = 0;
		while(a!=0) {
			int r = a%10;
			sum = sum*10+r;
			a/=10;
		}
		System.out.println(sum);
	}
}
