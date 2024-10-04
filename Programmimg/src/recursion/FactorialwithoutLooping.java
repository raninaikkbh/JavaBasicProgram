package recursion;

public class FactorialwithoutLooping {
	static int fact = 1;
	public static void factorial(int i) {
		if(i>0) 
		{
		fact *= i;
		factorial(--i);
		}
	}
	public static void main(String[] args) {
		factorial(0);
	}
}

