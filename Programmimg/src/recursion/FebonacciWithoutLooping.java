package recursion;

public class FebonacciWithoutLooping {
	static int f1 = 0;
	static int f2 = 1;
	static int a;
	public static void fibonacci(int i)
	{
		if(i<10) {
			System.out.print(f1 +" ");
			 a = f1 + f2;
			    f1 = f2;
			    f2 = a;
			    fibonacci(++i);	    
		}
	}
	public static void main(String[] args) {
		fibonacci(0);
	}
}

/*
0 1 1 2 3 5 8 13 21 34 
*/