package recursion;

public class NeonNumber {
	public static void main(String[] args) {
	int a = 9;    //0,1 and 9 only three neon number
	int sqr = a*a;
	int sum = 0;
	
	while(sqr!=0) {
		int r = sqr%10;
		sum += r;
		sqr/=10;
	}
	if(sum==a) {
		System.out.println("Number is neon number !!");
	}
	else {
		System.out.println("Number is not neon number !!");
	}

}
}
