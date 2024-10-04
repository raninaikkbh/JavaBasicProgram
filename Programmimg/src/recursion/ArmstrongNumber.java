package recursion;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 153;
		int sum = 0;
		
		 while(a!=0)
		 {
			int r = a%10;
			sum = sum +(r*r*r);
			a/=10;
		 }
			 System.out.println(sum);
	}
}

/*
153 is armstrong Number
*/