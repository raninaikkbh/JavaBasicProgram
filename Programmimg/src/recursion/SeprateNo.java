package recursion;

public class SeprateNo {
	public static void main(String[] args) {
		int a = 2453;
		while(a!=0) {
			int r = a%10;
			System.out.print(r);
			a/=10;
		}
	}

}
